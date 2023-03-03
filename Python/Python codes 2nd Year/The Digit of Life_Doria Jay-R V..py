print("Format: MMDDYYYY")
bday=int(input("Enter your Birthday: "))
result=0
while bday>0:
    digit=bday%10
    result=result+digit
    bday=bday//10
if bday == 0:    
    result = result%9  
print(result)


            

 
