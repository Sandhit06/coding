#include <stdio.h>
void myfunc(char name[])
{
    printf("Hello %s\n", name);
}
void main()
{
    char n[30];
    printf("Enter your name\n");
    gets(n);
    myfunc(n);
}