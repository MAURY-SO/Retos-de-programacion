
string1 = input("Ingresa una frase:")
string2 = input("Ingresa otra frase:")

array1 = []
array2 = []

string1.lower()
string2.lower()

array1 = list(string1)
array2 = list(string2)

# Eliminar elementos que coincidan
arrayr1 = [elem for elem in array1 if elem in array2]
arrayr2 = [elem for elem in array2 if elem in array1]

print(''.join(arrayr1))
print(''.join(arrayr2))