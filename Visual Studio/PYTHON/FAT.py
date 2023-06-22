s1 = input()
s2 = input()
n1 = len(s1)
n2 = len(s2)
s3=""
s5=""
for i in range(n1):
    s2=s2[0:n1+1]
    if(s1[i].isupper()):
        s3=s3+s2[i]
        s4=""+s3
for j in range(n2):
    s1=s1[0:n2+1]
    if(s2[j].isupper()):
        s5=s5+s1[j]
        s6=""+s5
s7=s6+s4
print(s7)