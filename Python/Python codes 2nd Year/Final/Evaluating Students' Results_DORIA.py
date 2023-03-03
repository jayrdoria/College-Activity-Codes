class StudentsDataException(Exception):
    pass 

class BadLine(StudentsDataException):
    def __str__ (self):
        return "There is/are bad line and wrong score in the file. Kindly check it:)" 

class FileEmpty(StudentsDataException):
    def __str__ (self):
        return "There is no data in the file. Check if you input the correct file:)"

def CloseAndExitFiles(src, e):
    src.close()
    return e.__str__()

try:
    srcname = input("Enter file name: ")
    src = open(srcname, "r")
    data = src.read().splitlines()
    src.close()
    if data == []: 
        raise FileEmpty()

    try:
        stud = {}
        for line in data:
            words = line.split()
            
            name = words[0] + " " + words[1] 
            
            points = float(words[2]) 

            if name in stud.keys(): 
                stud[name] += points
            else:                       
                stud[name] = points
                
    except:
            raise BadLine() 
        
except FileEmpty as fe:
    mes = CloseAndExitFiles(src, fe)
    print(mes)
except BadLine as bl:
    mes = CloseAndExitFiles(src, bl)
    print(mes)
except Exception as e:
    mes = CloseAndExitFiles(src, e)
    print(mes)

for a, b in sorted(stud.items()):
            print(a,"-->",b)




