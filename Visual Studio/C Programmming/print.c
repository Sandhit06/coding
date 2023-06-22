/*#include <stdio.h>
struct Student
{
    char name[20];
    int marks;
};
struct Student s[3];
int i,j;
void print()
{
    for(i=0;i<3;i++)
    {
        //printf("\nEnter the record of students");
        printf("Student name");
        scanf("%s", s[i].name);        
    }
    for(j=0;j<3;j++)
    {
        printf("Student marks");
        scanf("%d", &s[j].marks);
    }
    for(i=0;i<3;i++)
    {
        printf("Students name are %s\n", s[i].name);
        printf("Students marks are %d\n", s[i].marks);
    }
};
int main()
{
    print();
    return 0;
}*/
#include <stdio.h>
#include <string.h>
int main() 
{
   char s,s1[20],s2[30];
   scanf("%c", &s);
   scanf("%s\n", &s1);
   fgets(s2,30,stdin);
   printf("%c\n", s);
   printf("%s\n", s1);
   printf("%s", s2);    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}