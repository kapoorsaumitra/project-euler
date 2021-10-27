import math

a = math.factorial(100)
as1 = str(a)
ar = as1.strip()
m = sum(map(int, ar))
print(m)
