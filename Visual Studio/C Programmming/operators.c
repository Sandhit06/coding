#include <stdio.h>
void main()
{
    int q , d=0;
    float r,t;
    printf("Enter quantity and rate");
    scanf("\n%d\n%f, &q,&r");
    if(q>1000)
       d=10;

    t= (q*r)-(q*r*d/100);
    printf("Total Expenses=Rs.%f\ntot");
}