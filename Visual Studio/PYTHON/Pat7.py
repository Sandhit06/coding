a=int(input())
b=int(input())
def square(a,b):
    l=[]
    for i in range(a,b+1):
        l.append(i**2)
    return l

l = square(a,b)
print(l[i] for i in range(5,len(l)))
print(l[i] for i in range(len(l)-1,len(l)-6,-1)[::-1])
print(tuple(l))
print([i for i in l if i%2 == 0])
print([i for i in l if i%2 == 1 )
