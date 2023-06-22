/*#include <stdio.h>
void main()
{
    //Body of the function
    int a, b , c ;
    scanf("\n%d",&a);
    scanf("\n%d",&b);
    c= a+b ;
    printf("%d",c);
}*/
#include <stdio.h>
int main() {
  char *romans[] = { "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix", "x"};
  int i;
  
  for (i = 0; i < 9; i++) {
    printf("%s\n", romans[i]);
  } 
  return 0;
}