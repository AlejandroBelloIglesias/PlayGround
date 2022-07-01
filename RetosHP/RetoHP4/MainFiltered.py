import csv
from unicodedata import decimal

# Separate a float into two integers
def separateFloat(number):
    return int(number), int((number - int(number)) * 100)

# Opening filtered .csv
with open('../../fraud_log_filtered.csv', 'r') as csv_file:
    csv_reader = csv.reader(csv_file)
    row = next(csv_reader)

    # Total number of each bill and coin
    total_cash = {
        "500": 0,
        "200": 0,
        "100": 0,
        "50": 0,
        "20": 0,
        "10": 0,
        "5": 0,
        "2": 0,
        "1": 0,
        "0.50": 0,
        "0.20": 0,
        "0.10": 0,
        "0.05": 0,
        "0.02": 0,
        "0.01": 0
    }

    for row in csv_reader:

        # Converts the float to an integer multiplying by 100 so we don't have to manage decimals
        decimalRemover = 100
        ammount = int (float(row[2]) * decimalRemover) # !
        
        # Algorithm to get the max ammount of cash representations
        n500Bills = int(ammount / (500 * decimalRemover))
        ammount = ammount - (n500Bills * (500 * decimalRemover))
        n200Bills = int(ammount / (200 * decimalRemover))
        ammount = ammount - (n200Bills * (200 * decimalRemover))
        n100Bills = int(ammount / (100 * decimalRemover))
        ammount = ammount - (n100Bills * (100 * decimalRemover))
        n50Bills = int(ammount / (50 * decimalRemover))
        ammount = ammount - (n50Bills * (50 * decimalRemover))
        n20Bills = int(ammount / (20 * decimalRemover))
        ammount = ammount - (n20Bills * (20 * decimalRemover))
        n10Bills = int(ammount / (10 * decimalRemover))
        ammount = ammount - (n10Bills * (10 * decimalRemover))
        n5Bills = int(ammount / (5 * decimalRemover))
        ammount = ammount - (n5Bills * (5 * decimalRemover))
        n2Bills = int(ammount / (2 * decimalRemover))
        ammount = ammount - (n2Bills * (2 * decimalRemover))
        n1Bills = int(ammount / (1 * decimalRemover))
        ammount = ammount - (n1Bills * (1 * decimalRemover))
        n50Cents = int(ammount / 50)
        ammount = ammount - (n50Cents * 50)
        n20Cents = int(ammount / 20)
        ammount = ammount - (n20Cents * 20)
        n10Cents = int(ammount / 10)
        ammount = ammount - (n10Cents * 10)
        n5Cents = int(ammount / 5)
        ammount = ammount - (n5Cents * 5)
        n2Cents = int(ammount / 2)
        ammount = ammount - (n2Cents * 2)
        n1Cents = int(ammount / 1)
        ammount = ammount - (n1Cents * 1)

        total_cash["500"] += n500Bills
        total_cash["200"] += n200Bills
        total_cash["100"] += n100Bills
        total_cash["50"] += n50Bills
        total_cash["20"] += n20Bills
        total_cash["10"] += n10Bills
        total_cash["5"] += n5Bills
        total_cash["2"] += n2Bills
        total_cash["1"] += n1Bills
        total_cash["0.50"] += n50Cents
        total_cash["0.20"] += n20Cents
        total_cash["0.10"] += n10Cents
        total_cash["0.05"] += n5Cents
        total_cash["0.02"] += n2Cents
        total_cash["0.01"] += n1Cents

# Print the total cash
print ("Total cash: ")
for key in total_cash:
    print (key, ": ", total_cash[key])



