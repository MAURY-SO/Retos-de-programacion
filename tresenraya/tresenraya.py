
cuadro= [[" "," "," "],[" "," "," "],[" "," "," "]]

print("  0 1 2  <-x")
for x in range (0,3):
    print(x,end=" ")
    for y in range(0,3):
        print(cuadro[x][y],end="|")
    print()

v1 = input("Cual empieza (x) o (o)? ")
v2 = ""

if v1 == "x":
    v2="o"
else:
    v2="x"

def ingresar(cuadro, v1,v2):
    
    va1 = v1
    va2 = v2
    while True:
        x=int(input("Que posicion en x '"+va1+"' ?"))
        y=int(input("Que posicion en y '"+va1+"' ?"))
        cuadro[y][x] = va1
        print("  0 1 2 <-x")
        for x in range (0,3):
            print(x,end=" ")
            for y in range(0,3):
                print(cuadro[x][y],end="|")
            print()
           
        if cuadro[0][0] == cuadro[1][1] == cuadro[2][2] == va1:
            print("Gano "+va1)
            break
            
        aux = va1
        va1 = va2
        va2 = aux
        
       
        
ingresar(cuadro,v1,v2)