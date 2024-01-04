
n = input("Ingresa una palabra en minuscula:")

def Mayus(palabra):
    dic="abcdefghijklmnopqrstuvwxyz"
    dic2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    c=0
    while True:
        if palabra[0]==dic[c]:
            palabra[0]==dic2[c]
            return dic2[c]
        else:
            c+=1
     

        
print(Mayus(n))