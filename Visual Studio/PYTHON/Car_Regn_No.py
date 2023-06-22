reg = input()
a,b,c,d = reg[:2], reg[2:4], reg[4:5], reg[5:]
if all((a.isalpha(), b.isdigit(), c.isalpha(), d.isdigit())):
    print('Valid')
else:
    print('Invalid')
    