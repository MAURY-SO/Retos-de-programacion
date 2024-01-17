"""
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 """
c = input("Ingresa una cadena de texto: ")

for i in reversed(range(0,len(c))):
    print(c[i], end="")