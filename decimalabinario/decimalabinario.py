"""
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 """
n = int(input("Escribe un numero para convertirlo a binsrio: "));
b=""
while n>0:
    if n%2==0:
        b = "0" + b
    else:
        b = "1" + b
        
    n//=2
    
print(b)