
p = input("ingrese una frase: ")

p.lower()

array_aux = ''.join(p.split())
array = list(array_aux)

array_aux = array[::-1]

print(array)
print(array_aux)

if array_aux==array:
    print("La frase es un palindromo")
else:
    print("No es un palindromo")