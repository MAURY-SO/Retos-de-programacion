def Conversor(dias, horas, minutos, segundos):
    
    v1 = dias * 24 * 60 * 60 * 1000
    v2 = horas * 60 * 60 * 1000
    v3 = minutos * 60 * 1000
    v4 = segundos * 1000
    
    return v1 + v2 + v3 + v4


print(str(Conversor(54,0,0,1))+" milisegundos")