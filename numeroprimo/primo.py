"""
  Escribe un programa que se encargue de comprobar si un número es o no primo.
  Hecho esto, imprime los números primos entre 1 y 100.
  
 """

from math import sqrt

n = float(input("Ingresa un número: "))

def EsPrimo(numero):
    if numero <= 1:
        return False
    
    
    for i in range(2, int(sqrt(numero)) + 1):
        if numero % i == 0:
            return False
    
    return True

primo = EsPrimo(n)

if primo:
    print("Es primo")
else:
    print("No es primo")
