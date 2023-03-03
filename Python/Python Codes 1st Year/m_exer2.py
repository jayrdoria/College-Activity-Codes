num = int(input("Enter number: "))
adder,count = 1,0
value = []
while count < num:
    value.insert(count,(input("Value "+str(adder)+": ")))
    adder+=1
    count+=1
value2 = [float(a) if '.' in a else int(a) for a in value] 
print("The list is:",value2)
print("The largest number is:",max(value2))
print("The smallest number is:",min(value2))
