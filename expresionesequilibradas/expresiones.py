exp = input("Ingresa una expresión: ")

p_d = ["(", ")", "{", "}", "[", "]"]
dic_aux = []
co_dic = []
c = 0

p_d.sort()
set_d = set(p_d)
set_e = set(exp)

exp_aux = sorted(set_d.intersection(set_e))

if(len(exp_aux)%2!=0):
    c=len(exp_aux)+1
else:
    c=len(exp_aux)
    
for i in range(0,c):
    co_dic.append(p_d[i])

if exp_aux == co_dic:
    print("Expresion balanceada")
else:
    print("Expresion no balanceada")
