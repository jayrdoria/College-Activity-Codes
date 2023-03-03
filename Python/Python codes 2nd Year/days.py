def isYearLeap(year):
    if(year % 4 == 0 or year % 400 == 0):
        return True
    elif(year % 100 == 0):
        return False
    else:
        return False

def daysInMonth(year, month):
	if year < 1582 or month < 1 or month > 12:
		return None
	days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
	ans  = days[month - 1]
	if month == 2 and isYearLeap(year):
		ans = 29
	return ans

def dayOfYear(year, month, day):
	days = 0
	for a in range(1, month):
		mo = daysInMonth(year, a)
		if mo == None:
			return None
		days += mo
	mo = daysInMonth(year, month)
	if day >= 1 and day <= mo:
		return days + day
	else:
		return None

print(dayOfYear(2000, 12, 31))
