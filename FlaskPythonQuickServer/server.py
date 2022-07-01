#pip3 install flask

from flask import Flask
app = Flask(__name__)

def getHtml(path):
    with open(path, 'r') as file:
        return file.read()

@app.route('/')
def hello_world():
    return getHtml('index.html')

@app.route('/user/<int:user_id>', methods=['POST'])
def user(user_id):
    return "User %d" % user_id

