from os import strerror
filename = input("What is the filename? ")
try:
    file = open(filename, 'rt')
except IOError as e:
    print("Cannot open file.", strerror(e.errno))
    exit() 
dictio = {}
count = 0
read = file.read().lower()
read = sorted(read)
for char in read:
    if char.isalpha() == True:
        if char not in dictio.keys():
            count = 1
            dictio.update({char.lower(): count})
        else:
            count += 1
            dictio.update({char.lower(): count})
           
newfile = filename.split('.')[0]
output = open(newfile + '.hist', 'w+t')

for a, b in dictio.items():
    print(a,"-->",b)
    output.write(str(a) + ' --> ' + str(b) + '\n')

file.close()
output.close()
