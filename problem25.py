from fibonacci import fibonacci
import math

i = 1

while (int(math.log10(fibonacci(i))) + 1) != 1000:    
    i += 1

print(i)
