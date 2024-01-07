cuadro = [[" ", " ", " "], [" ", " ", " "], [" ", " ", " "]]

def imprimir_tablero(cuadro):
    print("  0 1 2  <-x")
    for x in range(0, 3):
        print(x, end=" ")
        for y in range(0, 3):
            print(cuadro[x][y], end="|")
        print()

v1 = input("Cual empieza (x) o (o)? ")
v2 = ""

if v1 == "x":
    v2="o"
else:
    v2="x"


def ingresar(cuadro, v1, v2):
    va1 = v1
    va2 = v2
    imprimir_tablero(cuadro)
    while True:
        x = int(input("En qué posición en y '" + va1 + "' quieres colocar? "))
        y = int(input("En qué posición en x '" + va1 + "' quieres colocar? "))
        cuadro[y][x] = va1
        imprimir_tablero(cuadro)
        
        # Verificar si alguien ganó en filas, columnas o diagonales
        for i in range(3):
            if cuadro[i][0] == cuadro[i][1] == cuadro[i][2] == va1 or \
               cuadro[0][i] == cuadro[1][i] == cuadro[2][i] == va1 or \
               cuadro[0][0] == cuadro[1][1] == cuadro[2][2] == va1 or \
               cuadro[0][2] == cuadro[1][1] == cuadro[2][0] == va1:
                print("¡Ganó el jugador " + va1 + "!")
                return
        
        # Si no hay ganador, intercambiar turnos
        aux = va1
        va1 = va2
        va2 = aux

ingresar(cuadro, v1, v2)
