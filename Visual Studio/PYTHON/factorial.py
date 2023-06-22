n= int(input())
n2= int(input())
def factorial(n):
    if n==0 :
        return 1
    else:
        return n* factorial(n-1)

n1=factorial(n)
print(n1)