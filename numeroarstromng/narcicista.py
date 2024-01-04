
n = input("Ingresa un numero: ")
r = 0 

for i in range(0,len(n)):
    r+=int(n[i])**len(n) 

if(r==int(n)):
    print("Es un numero narcicista");
else:
    print("No es un numero narcicista");