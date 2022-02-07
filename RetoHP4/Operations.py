
# Creates a class able to do operations into the database
class Operations:

    # Opens a connection with a mysql database and returns the connection
    def open_connection():
        try:
            connection = mysql.connector.connect(
                host='95.22.240.188',
                database='reto_hp_4',
                user='alejandrob',
                password='abc123.'
            )

            return connection

        except Error as e:
            print(e)


    # Inserts a new row into the database
    def insert(step, type, amount, nameOrig, oldbalanceOrg, newbalanceOrig, nameDest, oldbalanceDest, newbalanceDest, isFraud, isFlaggedFraud):
        try:
            connection = Operations.open_connection()
            cursor = connection.cursor()
            sql_insert_query = """ INSERT INTO transactions (step, type, amount, nameOrig, oldbalanceOrg, newbalanceOrig, nameDest, oldbalanceDest, newbalanceDest, isFraud, isFlaggedFraud) VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s) """
            record_to_insert = (step, type, amount, nameOrig, oldbalanceOrg, newbalanceOrig, nameDest, oldbalanceDest, newbalanceDest, isFraud, isFlaggedFraud)
            cursor.execute(sql_insert_query, record_to_insert)
            connection.commit()
            #print("Record inserted successfully into transactions table")

        except mysql.connector.Error as error:
            print("Failed to insert into MySQL table {}".format(error))


        