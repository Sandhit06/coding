#include <stdio.h>
void main()
{
    //printf("Hello World");
    int var = 10;
    int *ptr;
    ptr = &var;
    printf("%p\n", ptr);
    printf("%d\n", var);
    printf("%d\n", *ptr);
}