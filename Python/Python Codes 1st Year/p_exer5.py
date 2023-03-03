
stop = 1
while stop != 0:
    ht = float(input("Enter your Height: "))
    wt = float(input("Enter your Weight: "))
    bmi = wt /(ht ** 2)
    if(bmi >=17 and bmi <= 18.4):
        print("Underweight")
    elif(bmi >=18.5 and bmi <= 25):
        print("Normal(Healthy weight)")
    elif(bmi >=26 and bmi <= 30):
        print("Overweight")
    elif(bmi >=31 and bmi <= 35):
        print("Obese Class I(Moderately obese)")
    elif(bmi >=36 and bmi <= 40):
        print("Obese Class II(Severely obese)")
    elif(bmi > 41):
        print("Obese Class III(Very severely obese)")
    else:
        print("Severely underweight")
    stop = float(input("Do you want to continue?\nYes - 1\nNo  - 0\nChoice: "))
    if (stop == 0):
        print("Exiting program................")
        break
         
    
