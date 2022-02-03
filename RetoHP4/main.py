# Reads a csv document
import csv

# Define a class model which represents a row in the csv file
# Fields will be ['step', 'type', 'amount', 'nameOrig', 'oldbalanceOrg', 'newbalanceOrig', 'nameDest', 'oldbalanceDest', 'newbalanceDest', 'isFraud', 'isFlaggedFraud']
class Transaction:
    def __init__(self, step, type, amount, nameOrig, oldbalanceOrg, newbalanceOrig, nameDest, oldbalanceDest, newbalanceDest, isFraud, isFlaggedFraud):
        self.step = step
        self.type = type
        self.amount = amount
        self.nameOrig = nameOrig
        self.oldbalanceOrg = oldbalanceOrg
        self.newbalanceOrig = newbalanceOrig
        self.nameDest = nameDest
        self.oldbalanceDest = oldbalanceDest
        self.newbalanceDest = newbalanceDest
        self.isFraud = isFraud
        self.isFlaggedFraud = isFlaggedFraud


with open('fraud_log.csv', 'r') as csv_file:
    csv_reader = csv.reader(csv_file)
    # Skip the header
    next(csv_reader)
    transactions = []
    for i in range(1,100):
        # Read the csv file row by row
        row = next(csv_reader)
        print(row)
        transactions.append(Transaction(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9], row[10]))
        
        
