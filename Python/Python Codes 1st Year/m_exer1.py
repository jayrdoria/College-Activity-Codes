list = []
a,adder = 0,1
while a < 5:   
    list.append(int(input("Enter number "+str(adder)+" : ")))
    a+=1
    adder+=1
print("The inputted values are:",list)
