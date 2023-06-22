#include <stdio.h>
#include <string.h>
void main()
{
     int i,n, l=0;
     char name[40];
     printf("Enter name\n");
     scanf("%[^\n]", name);
     printf("Name = %s\n", name);
     l = strlen(name);
     printf("%d", l);
     scanf("%d", &n);
     switch(n)
     {
         case 1:
           printf("It is first case");
           break;
         case 2:
           printf("It is second case");
           break;
         case 3:
           printf("It is third case");
           break;
         default:
           printf("No case at all");
     }
}