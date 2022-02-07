# Reads a csv document
import csv
from Transaction import Transaction

# Writes into mysql database
import mysql.connector
from mysql.connector import Error

with open('../../fraud_log.csv', 'r') as csv_file:

    csv_reader = csv.reader(csv_file)
    transactions = []

    row = next(csv_reader)
    print(row) # Print the header
    
    for row in csv_reader: # Read the csv file row by row
        row = next(csv_reader)
        if (row[9] == '1'):  # If isFraud
            if (row[10] == '1'):
                transactions.append(
                    Transaction(
                        int(row[0]), # step
                        row[1], # type
                        float(row[2]), # amount 
                        row[3], # nameOrig
                        float(row[4]), # oldbalanceOrg
                        float(row[5]), # newbalanceOrig
                        row[6], # nameDest
                        float(row[7]), # oldbalanceDest
                        float(row[8]), # newbalanceDest
                        bool(row[9]), # isFraud
                        bool(row[10]) # isFlaggedFraud
                    )
                )
                print(row)
        
    print(transactions.toString())
        

