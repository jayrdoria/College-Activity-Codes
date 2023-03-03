num = int(input("Enter your number: "))
n1,n2 = 0,1
count = 0
while count < num:
    print(n1,end =" ")
    nth = n1+n2
    n1 = n2
    n2 = nth
    count += 1
 
