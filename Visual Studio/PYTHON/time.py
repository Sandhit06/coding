h = int(input("Enter hours"))
m = int(input("Enter minutes"))
s = int(input("Enter seconds"))
if ( h>0 and m>0 and s>0 and h<24 ):
    if(h>12):
        h1=h-12
        print(h1,":",m,":",s,"PM",sep="")
    else:
        print(h,":",m,":",s,"AM",sep="")
else:
    print("Wrong Input")