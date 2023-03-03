def isYearLeap(year):
    if(year % 4 == 0 or year % 400 == 0):
        return True
    elif(year % 100 == 0):
        return False
    else:
        return False

def daysInMonth(year,month):
	if year < 1582 or month < 1 or month > 12:
		return None
	days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
	ans  = days[month - 1]
	if month == 2 and isYearLeap(year):
		ans = 29
	return ans

testyears = [1900, 2000, 2016, 1987]
testmonths = [ 2, 2, 1, 11]
testresults = [28, 29, 31, 30]
for i in range(len(testyears)):
	yr = testyears[i]
	mo = testmonths[i]
	print(yr,mo,"-> ",end="")
	result = daysInMonth(yr, mo)
	if result == testresults[i]:
		print("OK")
	else:
		print("Failed")
