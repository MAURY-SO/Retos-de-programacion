archivo = open("calculadoratxt/Challenge21.txt")

def analizar(linea):
    
    dic = {"x","-","/","*"}
    
    for sim in dic:
        if linea==sim:
            return sim


dic = {"x","-","/","*"}
    

if archivo.readline(2)=='+':
    print(True)