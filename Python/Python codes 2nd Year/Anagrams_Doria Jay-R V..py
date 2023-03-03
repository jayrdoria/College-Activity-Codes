fword=input("First Word: ")
sword=input("Second Word: ")
word1=''.join([a for a in fword if a.isalpha()]).replace(" ","").lower()
word2=''.join([b for b in sword if b.isalpha()]).replace(" ","").lower()
if (sorted(word1) == sorted(word2)):
    print("Anagrams")
else:
    print("Not anagrams")
