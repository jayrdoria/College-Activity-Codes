data = [1900, 2000, 2016, 1987]
def leapyear(year):
        if(year % 4 == 0 or year % 400 == 0):
            return True
        elif(year % 100 == 0):
            return False
        else:
            return False
for i in range (len(data)):
    print(data[i],"--->",leapyear(data[i]))

    
