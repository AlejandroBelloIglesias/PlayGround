import csv

# Rows of the transactions are: 
    # step, type, amount, nameOrig, oldbalanceOrg, newbalanceOrig, nameDest, oldbalanceDest, newbalanceDest, isFraud, isFlaggedFraud
def filterType(row):
    if row[1] == 'CASH_OUT':
        return True
    else:
        return False

def filterFraud(row):
    if row[9] == '1':
        return True
    else:
        return False

# Opening .csv
with open('../../fraud_log.csv', 'r') as csv_file:

    csv_reader = csv.reader(csv_file)

    row = next(csv_reader)

    counter = 0
    for row in csv_reader: # Read the csv file row by row
        if filterType(row) and filterFraud(row):
            # Saves the row in a new csv file
            with open('../../fraud_log_filtered.csv', 'a', newline='') as csv_file:
                csv_writer = csv.writer(csv_file)
                csv_writer.writerow(row)
                counter += 1
        
print('Number of rows: ', counter)


