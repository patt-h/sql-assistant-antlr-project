const tables = ["klienci", "zamowienia", "produkty", "szczegoly_zamowienia"];
const columns = {
    "klienci": ["id", "imie", "nazwisko", "email"],
    "zamowienia": ["id", "klient_id", "data_zamowienia", "kwota"],
    "produkty": ["id", "nazwa", "kategoria", "cena"],
    "szczegoly_zamowienia": ["id", "zamowienie_id", "produkt_id", "ilosc", "cena"]
};

let numberOfTables = 0;
let afterWarunek = false;
let afterWhereCondition = false;

function findTablesByColumn(columnName) {
    const matchingTables = [];
    for (const [table, cols] of Object.entries(columns)) {
        if (cols.includes(columnName)) {
            matchingTables.push(table);
        }
    }
    return matchingTables;
}

function findOtherColumns(tableName, excludedColumn) {
    return columns[tableName].filter(c => c !== excludedColumn);
}

function findCurrentTable(words) {
    const zIndex = words.lastIndexOf("z");
    if (zIndex !== -1 && zIndex + 1 < words.length) {
        const tableName = words[zIndex + 1];
        if (tables.includes(tableName)) {
            return tableName;
        }
    }
    return null;
}

function smartAppend(currentInput, suggestion) {
    currentInput = currentInput.trim();

    if (suggestion.startsWith("z ") || suggestion === "dodaj" || suggestion === "warunek" || suggestion.startsWith("gdzie") || (suggestion.includes("=") && !suggestion.startsWith("nazwa_kolumny"))) {
        currentInput = currentInput.replace(/[, ]+$/, "");
        return (currentInput.length > 0 ? currentInput + " " : "") + suggestion + " ";
    }

    if (suggestion === "wszystko" || suggestion === "nazwa_kolumny" || suggestion === "Pokaz") {
        return (currentInput.length > 0 ? currentInput + " " : "") + suggestion + " ";
    }

    if (currentInput.endsWith(",")) {
        return currentInput + " " + suggestion + ",";
    } else {
        return (currentInput.length > 0 ? currentInput + " " : "") + suggestion + ",";
    }
}

function updateSuggestions() {
    const inputElement = document.getElementById("queryInput");
    const suggestionsElement = document.getElementById("suggestions");

    if (afterWhereCondition) {
        suggestionsElement.innerHTML = "";
        return;
    }

    const input = inputElement.value.trim();
    const words = input.split(/\s+/).map(w => w.replace(/,/g, "").toLowerCase());

    let suggestions = [];
    let lastWord = words.length > 0 ? words[words.length - 1] : "";

    suggestionsElement.innerHTML = "";

    if (input === "") {
        numberOfTables = 0;
        afterWarunek = false;
        afterWhereCondition = false;
        suggestions = ["Pokaz"];
    } else if (afterWarunek) {
        suggestions = [
            "zamowienia.klient_id = klienci.id",
            "zamowienia.id = szczegoly_zamowienia.zamowienie_id",
            "produkty.id = szczegoly_zamowienia.produkt_id"
        ];
    } else if (lastWord === "pokaz") {
        suggestions = ["wszystko", "nazwa_kolumny"];
    } else if (lastWord === "wszystko") {
        suggestions = tables.map(table => "z " + table);
    } else if (lastWord === "dodaj") {
        if (numberOfTables >= 2) {
            suggestions = ["warunek"];
        } else {
            suggestions = ["wszystko", "nazwa_kolumny"];
        }
    } else if (words.includes("dodaj")) {
        if (numberOfTables >= 2) {
            suggestions = ["warunek"];
        } else {
            const lastColumn = words[words.length - 1];
            const matchingTables = findTablesByColumn(lastColumn);

            if (matchingTables.length === 1) {
                const table = matchingTables[0];
                suggestions = [...columns[table].filter(c => c !== lastColumn), "z " + table];
            } else {
                const tableName = findCurrentTable(words);
                if (tableName) {
                    suggestions = ["wszystko", ...columns[tableName]];
                }
            }
        }
    } else if (words.includes("pokaz")) {
        const possibleTables = findTablesByColumn(lastWord);
        if (possibleTables.length === 1) {
            const table = possibleTables[0];
            suggestions = ["z " + table, ...findOtherColumns(table, lastWord)];
        } else if (possibleTables.length > 1) {
            suggestions = possibleTables.map(t => "z " + t);
        }
    }

    if (words.includes("z")) {
        const lastZIndex = words.lastIndexOf("z");
        if (lastZIndex >= 0 && lastZIndex + 1 < words.length) {
            const tableName = words[lastZIndex + 1];
            if (tables.includes(tableName)) {
                if (numberOfTables >= 2) {
                    suggestions = ["warunek"];
                } else if (!input.toLowerCase().includes("dodaj")) {
                    suggestions = ["dodaj"];
                }
            }
        }
    }

    suggestions.forEach(suggestion => {
        const div = document.createElement("div");
        div.classList.add("suggestion-item");
        div.innerText = suggestion;

        div.addEventListener("click", function() {
            let currentInput = inputElement.value.trim();

            if (suggestion === "warunek") {
                inputElement.value = smartAppend(currentInput, "warunek") + " ";
                afterWarunek = true;

                suggestionsElement.innerHTML = "";

                const warunki = [
                    "zamowienia.klient_id = klienci.id",
                    "zamowienia.id = szczegoly_zamowienia.zamowienie_id",
                    "produkty.id = szczegoly_zamowienia.produkt_id"
                ];

                warunki.forEach(warunek => {
                    const divW = document.createElement("div");
                    divW.classList.add("suggestion-item");
                    divW.innerText = warunek;
                    divW.addEventListener("click", function() {
                        inputElement.value = smartAppend(inputElement.value.trim(), warunek) + " ";
                        afterWarunek = false;

                        suggestionsElement.innerHTML = "";

                        const gdzieOption = document.createElement("div");
                        gdzieOption.classList.add("suggestion-item");
                        gdzieOption.innerText = "gdzie";
                        gdzieOption.addEventListener("click", function() {
                            let updatedInputWhere = document.getElementById("queryInput").value.trim();
                            updatedInputWhere = updatedInputWhere.replace(/[, ]+$/, "");
                            document.getElementById("queryInput").value = updatedInputWhere + " gdzie ";

                            afterWhereCondition = true;

                            suggestionsElement.innerHTML = "";

                            const whereConditions = [
                                "nazwa_kolumny =",
                                "nazwa_kolumny >"
                            ];

                            whereConditions.forEach(whereCondition => {
                                const divCond = document.createElement("div");
                                divCond.classList.add("suggestion-item");
                                divCond.innerText = whereCondition;
                                divCond.addEventListener("click", function() {
                                    let inputAfterWhere = document.getElementById("queryInput").value.trim();
                                    inputAfterWhere = inputAfterWhere.replace(/[, ]+$/, "");
                                    document.getElementById("queryInput").value = inputAfterWhere + " " + whereCondition + " ";
                                    updateSuggestions();
                                });
                                suggestionsElement.appendChild(divCond);
                            });
                        });
                        suggestionsElement.appendChild(gdzieOption);
                    });
                    suggestionsElement.appendChild(divW);
                });

                return;
            }

            if (suggestion.startsWith("z ")) {
                numberOfTables++;
            }

            inputElement.value = smartAppend(currentInput, suggestion) + " ";
            updateSuggestions();
        });

        suggestionsElement.appendChild(div);
    });
}

document.getElementById("queryInput").addEventListener("input", updateSuggestions);
window.addEventListener("DOMContentLoaded", () => {
    numberOfTables = 0;
    afterWarunek = false;
    afterWhereCondition = false;
    updateSuggestions();
});

// Funkcja wysyłająca zapytanie do backendu
function sendQuery() {
    const query = document.getElementById("queryInput").value;
    fetch("/api/query", {
        method: "POST",
        headers: {
            "Content-Type": "text/plain"
        },
        body: query
    })
    .then(response => response.json())
    .then(data => {
        displayTable(data);
    })
    .catch(error => {
        document.getElementById("result").innerText = "Błąd podczas wysyłania zapytania.";
    });
}

// Funkcja wyświetlająca odpowiedź w formie tabeli
function displayTable(data) {
    const resultDiv = document.getElementById("result");
    resultDiv.innerHTML = "";

    if (data.length === 0) {
        resultDiv.innerText = "Brak wyników.";
        return;
    }

    const table = document.createElement("table");
    table.classList.add("result-table");

    const thead = document.createElement("thead");
    const headerRow = document.createElement("tr");

    // Nagłówki tabeli
    Object.keys(data[0]).forEach(key => {
        const th = document.createElement("th");
        th.innerText = key;
        headerRow.appendChild(th);
    });
    thead.appendChild(headerRow);
    table.appendChild(thead);

    const tbody = document.createElement("tbody");

    // Wiersze tabeli
    data.forEach(row => {
        const tr = document.createElement("tr");
        Object.values(row).forEach(value => {
            const td = document.createElement("td");
            td.innerText = value;
            tr.appendChild(td);
        });
        tbody.appendChild(tr);
    });

    table.appendChild(tbody);
    resultDiv.appendChild(table);
}