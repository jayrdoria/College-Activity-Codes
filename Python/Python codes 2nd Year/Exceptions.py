class PhoneError(Exception):
    def __init__(self,phone,mes):
        Exception.__init__(self,mes)
        self.phone=phone

class RomError(PhoneError):
    def __init__(self,phone,rom,mes):
        PhoneError.__init__(self,phone,mes)
        self.rom=rom

def buyphone(phone,rom):
    if phone not in ["Poco","Xiaomi","Redmi"]:
        raise PhoneError(phone,"There is no stock or no existing brand in this store.")
    if rom not in [64,128]:
        raise RomError(phone,rom,"There is no available rom other than 64gb and 128gb")
    print("Thank you for purchasing our product!")

for (ph,rm) in [("Poco",128),("Redmi",256),("Samsung",64)]:
    try:
        buyphone(ph,rm)
    except PhoneError as p:
        print(p,"--->",ph)
    except RomError as r:
        print(r,"--->",rm)
        
