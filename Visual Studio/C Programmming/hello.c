#include <stdio.h>
void main()
{
    int age,n ;
    printf("Enter age\n");
    scanf("%d", &age);
    /*if ( age > 18 )    
      printf("They can vote");
    else if ( age > 12 && age<=18 )
      printf("Have a little patience . You gonna vote soon");
    else
      printf("Sorry you are not eligible");*/
    age >= 18 ? printf("Adult\n") : printf("Not Adult\n");
    int i=1;
    printf("Enter number\n");
    scanf("%d", &n);
    while (i<=n)
    {
        printf("Hello World\n");
        i++;
    }
}