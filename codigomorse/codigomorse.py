dm = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
d = "abcdefghijklmnopqrstuvwxyz"
p = input("Ingresa una palabra: ")
m = ""

def Index(pa,di,x):
    c = 0 
    while True:
        if di[c]==pa[x]:
            return c
            break
        else:
            c+=1
            
for i in range(0,len(p)):
    m=m+dm[Index(p,d,i)]+" "
          
print(m)           