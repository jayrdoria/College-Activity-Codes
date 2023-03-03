word=input("Input word: ")
text=input("Input letters: ")
text1=text.lower()
word1=word.lower()
count=0
for a in word1:
    result = text1.find(a)
    if result != -1:
        text1 = text1[0 : result] + text1[result+ 1:]
        count+=1
        
if count == len(word1):
    print("Yes")
else:
    print("No")



    
