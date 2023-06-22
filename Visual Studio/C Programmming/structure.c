#include <stdio.h>
#include <conio.h>
#include <string.h>
struct Student
{
    char name[40];
    int rollno;
};

int main()
{
    int i;
    struct Student record[2];
    record[0].rollno=1;
    strcpy(record[0].name,"Arjun");
    record[1].rollno=2;
    strcpy(record[1].name,"Sandhit");
    record[2].rollno=3;
    strcpy(record[2].name,"Abhishek");

    for(i=0;i<3;i++)
    {
        printf("Records: %d\n",i+1);
        printf("name is: %s\n",record[i].name);
        printf("rollno is: %d\n",record[i].rollno);
    }
}