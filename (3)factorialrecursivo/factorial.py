
n = int(input("Ingresa un numero: "))

def factorial(num):
    
    if n==1 or n==0:
        return 1
    else:
       return num * factorial(num-1)

print(factorial(n))