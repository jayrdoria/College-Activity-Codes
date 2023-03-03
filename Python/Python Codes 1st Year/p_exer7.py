num1 = 0
num2 = 1
choice = ""
t = True
while(t == True):
    num1 = int(input("Enter multiplier: "))
    num2 = int(input("Enter multiplicand: "))
    zero = 0
    while(zero <= num2):
        print(str(num1)+"*"+str(zero)+" = "+str(num1 * zero))
        zero+=1
    print("\n!!!CASE SENSITIVE!!!\nType 'Yes' if you want to continue\nType 'No' to stop the program")
    choice =input("Input again?: ")
    if choice == "Yes":
        print("Loading.............")
    else:
        t = False
    
    
