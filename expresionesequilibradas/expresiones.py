exp = input("Ingresa una expresión: ")

p_d = ["(", ")", "{", "}", "[", "]"]
dic_aux = []


p_d.sort()
set_d = set(p_d)
set_e = set(exp)

exp_aux = sorted(set_d.intersection(set_e))

print(len(exp_aux))


print(p_d)

if exp_aux == p_d:
    print("Expresion balanceada")
else:
    print("Expresion no balanceada")
