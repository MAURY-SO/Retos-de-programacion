def Mayus(palabra):
    dic = "abcdefghijklmnopqrstuvwxyz"
    dic2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    c = 0
    while True:
        if palabra[0] == dic[c]:
            lista = list(palabra)
            lista[0] = dic2[c]
            palabra = "".join(lista)  # Asignar el resultado de la concatenación a la variable 'palabra'
            break  # Terminar el bucle cuando se realice el cambio
        else:
            c += 1
    return palabra  # Devolver la palabra modificada

# Ejemplo de uso
palabra = "hola"
resultado = Mayus(palabra)
print(resultado)  # Imprimirá "Hola"
