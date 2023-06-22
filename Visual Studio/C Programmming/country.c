#include <stdio.h>
/*void italy();
void germany();
void india();

int main()
{
    printf("I am in main\n");
    italy();
    germany();
    india();
    return 0;
}
void italy()
{
    printf("I am in Italy\n");
}
void germany()
{
    printf("I am in Germany\n");
}
void india()
{
    printf("I am in India\n");
}*/
int calsum( int x , int y , int z);
int main()
{
    int a,b,c,sum;
    printf("Enter any three numbers");
    printf("%d %d %d", &a , &b , &c);
    sum = calsum(a,b,c);
    printf("%d\n", sum);
    return 0;
}
int calsum(int x, int y , int z)
{
    int d;
    d= x+y+z;
    return(d);
}
