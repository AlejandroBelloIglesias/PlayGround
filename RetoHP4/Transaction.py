
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
        
    def __str__(self):
        return '{} {} {} {} {} {} {} {} {} {} {}'.format(self.step, self.type, self.amount, self.nameOrig, self.oldbalanceOrg, self.newbalanceOrig, self.nameDest, self.oldbalanceDest, self.newbalanceDest, self.isFraud, self.isFlaggedFraud)