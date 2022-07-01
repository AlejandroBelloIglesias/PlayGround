# pip install pandas
# pip install bs4
# pip install requests
from bs4 import BeautifulSoup
import requests
import pandas as pd

url = "https://open.spotify.com/album/2cZ4rjMOn8zz1ToKSBQVWa"
page = requests.get(url)
soup = BeautifulSoup(page.content, 'html.parser')

# Play button
# Find "play-button" from the "data-testid" attribute
items = soup.select('button[data-testid="play-button"]')
for item in items:
    # Press the button
    item.click()
    
