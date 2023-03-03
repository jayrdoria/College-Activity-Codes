text=""
shift=""
a=1
cipher=""
text = input("Enter your message: ")
while a == 1:
    try:
        shift =int(input("Enter shift: "))
        if  shift < 1 or shift > 25:
            print("1-25 digit only!")
            continue
        a = 0
    except:
        print("Characters are invalid, 1-25 digit only!")
        continue

for ch in text:    
    if ord(ch) < 65 or ord(ch) > 122 or ord(ch)>90 and ord(ch)<97:
        cipher += ch

    if ch.isupper():       
        code=ord(ch)+shift             
        if code > 90:
            add = code%90
            new=64+add
            cipher+=chr(new)
        else:
            cipher+=chr(code)
    
    if ch.islower():       
        code=ord(ch)+shift             
        if code > 122:
            add = code%122
            new=96+add
            cipher+=chr(new)
        else:
            cipher+=chr(code)
print(cipher)


            
            

    
         
     
