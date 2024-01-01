
dm = ["._","_...","_._."]

d = "abc"

l = input("Ingresa una letra: ")

l.lower()

for i in range(0, len(l)):
    if l[i] == d[i]:
        print(dm[i], end=" ")