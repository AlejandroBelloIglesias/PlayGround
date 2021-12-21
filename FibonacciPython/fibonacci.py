
#Fibonacci sequence and stores each number in a list
def fibonacci(n):
    a = 0
    b = 1
    l = []
    for i in range(n):
        l.append(a)
        a, b = b, a + b
    return l
        
#Test

list = fibonacci(28)
print(list)