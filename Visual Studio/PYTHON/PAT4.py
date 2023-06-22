l=[]
n=int(input("Enter elements"))
L=[]
for i in range(0,n):
    ele= int(input())
    l.append(ele)
print("Output is :")
def prl(l,n):
    for i in range(0,n):
        for j in range(i+1,n):
            if l[i]<=l[j]:
                break
        if j==n-1:
            print(l[i])
prl(l,n)
