def l100kmtompg(liters):
    galons = liters / 3.785411784
    miles = 100 * 1000 / 1609.344
    return miles / galons

def mpgtol100km(miles):
    kilometers = miles * 1609.344 / 1000 / 100
    liters = 3.785411784
    return liters / kilometers

print(l100kmtompg(3.9))
print(l100kmtompg(7.5))
print(l100kmtompg(10.))
print(mpgtol100km(60.3))
print(mpgtol100km(31.4))
print(mpgtol100km(23.5))
