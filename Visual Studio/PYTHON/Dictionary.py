n = int(input("Enter a n value:"))
d = {}

for i in range(n):
    keys = input() # keys as strings
    values = input() # values as integers
    d[keys] = values
    
print(d)
n2 = int(input('Enter to be searched item'))

for i in range(len(d)):
    if n2==key_list[i]:
        print(val_list[i])
        break