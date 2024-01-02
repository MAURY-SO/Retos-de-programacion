exp = input("Ingresa una expresion: ")

def Valid(expresion):
    if len(expresion)%3!=0:
        return False
    else:
        return True
    
    pd = ["(",")","{","}","[","]"]
    exa = list(expresion)
    
    for i in range(0,len(expresion)):
        if expresion[i]==pd[]
    
    pd.sort()
    pd2.sort()
    
    if pd==pd2:
        return True
    else:
        return False


print(Valid(exp))