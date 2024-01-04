
n = input("Ingresa una palabra en minuscula:")

n = n.split(' ')

r = []

def Mayus(palabra):
    dic="abcdefghijklmnopqrstuvwxyz"
    dic2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    c=0
    while True:
        if palabra[0]==dic[c]:
            lista = list(palabra)
            lista[0] = dic2[c]
            return "".join(lista)
        else:
            c+=1
            
for i in range(0,len(n)):
    r.append(Mayus(n[i])) 

n = ' '.join(r)

print(n)