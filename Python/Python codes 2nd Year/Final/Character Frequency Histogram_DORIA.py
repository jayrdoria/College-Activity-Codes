from os import strerror
filename = input("What is the filename? ")
try:
    file = open(filename, 'rt')
except IOError as e:
    print("Cannot open file.", strerror(e.errno))
    exit() 
dictio = {}
count = 0
read = file.read(1).lower()
for char in read:
    if char.isalpha() == True:
        if char in dictio.keys():
            count += 1
            dictio.update({char: count})
        else:
            count = 1
            dictio.update({char: count})

for a, b in dictio.items():
    print(a,"-->",b)
    
file.close()
