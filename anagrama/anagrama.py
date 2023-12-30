"""
  Escribe una función que reciba dos palabras (String) y retorne
  verdadero o falso (Bool) según sean o no anagramas.
  - Un Anagrama consiste en formar una palabra reordenando TODAS
    las letras de otra palabra inicial.
  - NO hace falta comprobar que ambas palabras existan.
  - Dos palabras exactamente iguales no son anagrama.
 """

print("Detector de anagramas ✓")
p1 = input("Ingresa una palabra:");

p2 = input("Ingresa otra palabra:");

p1.lower()
p2.lower()

pa1 = list(p1)
pa2 = list(p2)

pa1.sort()
pa2.sort()

if pa1==pa2:
    print("Las palabras son anagramas")
    
else:
    print("Las palabras no son anagramas")