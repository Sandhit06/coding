#include <stdio.h>
float getArea(float r1, float r2 );
void main()
{
    float r1 , r2 , b;
    scanf("%f %f", &r1 , &r2);
    if ( r2 > r1)
    {
        printf("Second Circle cannot be greater ");
    }
    else
    {
        b = getArea(r1 , r2);
        printf("%.2f", b);
    }    
}
float getArea(float n1 , float n2 )
{
    float a1 , a2 , c;
    a1 = (22/7)*n1*n1;
    a2 = (22/7)*n2*n2;
    c = a1 - a2;
    return (c);
}