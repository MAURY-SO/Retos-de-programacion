
n = int(input("Ingresa un numero: "))

def factorial(num):
    
    if num>1:
        num = num * factorial(num-1)
    return num
        
print(factorial(n))