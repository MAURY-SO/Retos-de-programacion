
pre = 0
pos = 1
a = 0 

print("Números primos")

for i in range(1,50):
    
    print(a)
    a = pre + pos
    pre = pos
    pos = a
