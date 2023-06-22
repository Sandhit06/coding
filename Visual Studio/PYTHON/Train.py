myList = []
length = int(input())
for i in range(0, length):
    value = int(input())
    myList.append(value)
ele = int(input())

# checking for the presence of element in list
found = False
for i in myList:
    if(i == ele) :
        found = True
        break
if(found):
    print("1")
else :
    print("0")  