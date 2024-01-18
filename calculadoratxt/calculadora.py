archivo = open("calculadoratxt/Challenge21.txt")

op = archivo.read()

for i in range(0,len(op)):
    match op[i]:
        case '+':
            print("+")
        case '*':
            print("*")
        case '-':
            print("-")
        case '/':
            print("/")
