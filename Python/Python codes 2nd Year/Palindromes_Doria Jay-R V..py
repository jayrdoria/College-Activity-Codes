word=input("Enter word: ")
text = ''.join([a for a in word if a.isalpha()]).replace(" ","").lower()
if text == text[::-1]:
    print("It's a Palindrome")
else:
    print("It's not a Palindrome")

