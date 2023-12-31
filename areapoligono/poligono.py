from math import pi

p = int(input("Define que figura deseas calcular su area: (1)Triangulo (2)Cuadrado (3)Circulo: "));

def Area(poligono):
    
    if (poligono==1)or(poligono==2):
        base = int(input("Ingresa la base: "))
        altura = int(input("Ingresa la altura: "))
        if(poligono==1):
            return (base*altura)/2
        else:
            return base*altura
        
    if poligono==3:
        radio = int(input("Ingresa el valor del radio: "))
        return pi*radio
    
area = Area(p);
    
print("El area del poligono es "+str(area))