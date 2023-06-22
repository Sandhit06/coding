/* #include <stdio.h>
 void main()
{
    int a[10], i , min, n;
    printf("Enter the number of digits\n");
    scanf(" %d\n", &n);
    for(i=0; i<n ; i++)
    {
        scanf("%d", &a[i]);
    }
    min = a[0];
    for(i=0;i<n;i++)
    {
        if(a[i]<min)
            min = a[i];
    }
    printf("Minimum is %d", min);
}
void main()
{
    int arr[5];
    int i;
    for(i=0;i<5;i++)
    {
        scanf("%d", &arr[i]);
    }
    for(i=0;i<5;i++)
    {
        printf("%d", arr[i]);
    }
}
void fun( int );
int main()
{
    int a=30 ;
    fun(a);
    printf("%d\n",a );
    return 0;
}
void fun(int b)
{
    b=60;
    printf("%d\n", b);
}
void display(int j);
int main()
{
    int i=20;
    display(i);
    return 0;
}
void display(int j)
{
    int k=35;
    printf("%d\n", j);
    printf("%d\n", k);
}
#include <stdio.h>
#include <math.h>
int main()
{
    float a=0.5;
    float w,x,y,z;
    w = sin(a);
    x = cos(a);
    y = tan(a);
    z = pow(a,2);  
    printf("%f \n%f \n%f \n %f \n", w, x,y,z);
    return 0;  
}
#include <stdio.h>
void display(int m);
int main()
{
    int i;
    int marks[] = {55,65,75,56,78,90};
    for( i=0 ; i<=6 ; i++ )
       display(marks[i]);
    return 0;
}
void display(int m)
{
    printf("%d ",m);
}
#include <stdio.h>
void display(int m);
int main()
{
    int i;
    int marks[5];
    for(i=0;i<5;i++)
    {
        scanf("%d", &marks[i]);
    }
    for(i=0;i<5;i++)
    {
        display(marks[i]);
    }
    return 0;
}
void display(int m)
{
    printf("%d ",m);
}
//POINTERS
#include <stdio.h>
int main()
{
    int i=3;
    printf("Address of i=%d\n", &i);
    printf("Value of i = %d\n", i);
    return 0;
}
#include <stdio.h>
int main()
{
    int arr[10];
    int* p[10] = &arr;
    printf("%d \n", p);
    return 0;
}
#include <stdio.h>
void main()
{
    char str[100];
    fgets(str , 10 , stdin);
    puts(str);
}
#include <stdio.h>
void main()
{
    char *change = "Hello World";
    puts(change);
    change = "Hello";
    puts(change);
}
#include <stdio.h>
void main()
{
    int i=1,j=1, p , b;
    p = ++i;
    b= j++;
    printf("Value of p is %d\n", p);
    printf("Value of b is %d", b);
}
#include <stdio.h>
#include <string.h>
void main()
{
    int b;
    char name[100];
    fgets(name, 30, stdin);
    puts(name);
    //for( i=0; name[i] !='\0'; i++ );
    b = strlen(name);
    printf("Length of string is %d", b); 
}
#include <stdio.h>
#include <string.h>
int main()
{
    char destination[] = "Hello ";
    char source[] = "World!";
    strcat(destination,source);
    printf("Concatenated String: %s\n", destination);
    return 0;
}
#include <stdio.h>
#include <string.h>
struct student
{
    int roll;
    float marks;
    char name[30];
};
void main()
{
    struct student s1;    
    scanf("%d\n", &s1.roll);
    scanf("%f\n", &s1.marks);
    fgets( s1.name, 30 , stdin);
    printf("Student name %s\n",s1.name );
    printf("Student Roll %d\n",s1.roll);
    printf("Student marks %.2f", s1.marks);
}
#include <stdio.h>
#include <string.h>
struct student 
{
    char name[30], name2[30];
};
void main()
{
    struct student s1 ;
    fgets(s1.name,30,stdin);
    fgets(s1.name2,30,stdin);
    printf("%s %s", s1.name , s1.name2);

}
#include <stdio.h>
#include <string.h>
void main()
{
    char name[30], name1[30];
    gets(name);
    gets(name1);
    printf("Concatenated String: %s\n", strcat(name, name1));
}
//Structures in C
#include <stdio.h>
struct Total 
{
    int myNum;
    char mL;
};
int main()
{
    struct Total s1;
    printf("Enter any number\n");
    scanf("%d", &s1.myNum);
    s1.mL = 'B';
    printf("My number: %d\n", s1.myNum);
    printf("My Letter: %d", s1.mL);
}
#include <stdio.h>
#include <string.h>
struct hello
{
    char strings[3][256];
};
int main()
{
    struct hello s1;
    for(int i=0; i<3; i++)
    {
        scanf("%s", &s1.strings[i]);
    }
    printf("Output is :\n");
    for(int i=0; i<3 ; i++)
    {
        printf("%s\n", s1.strings[i]);
    }   
}
#include <stdio.h>
int main()
{
    char c[]="ALPHA2021";
    char *p= c;
    printf("%s", p+(p[3]-p[1]));
    //printf("%s", p+(p[3]-p[1])+2);
    return 0;
}
#include <stdio.h>
void increment( int n)
{
    static int d=2;
    printf("%d", n);
    printf("%d", d);
    ++d;
    if(n>1)
    increment(n-1);
    printf("%d", d);
}
int main()
{
    increment(3);
    return 0;
}
#include <stdio.h>
int main()
{
    //int arr[5]= {1,2,3,4,5};
    int *ptr = NULL;
    printf("%d\n", ptr);
    return 0;
}
#include <stdio.h>
int g=50;
int main()
{
    int a,b;
    a = 10;
    b = 20;
    g = a+b;
    printf("Value of a=%d, b=%d and g=%d\n", a , b, g);
    return 0;
}
#include <stdio.h>
int product_sum(int *a,int *b, int n)
{
    int s;
    for(i=0;i<n;i++)
    {
        *a[i]= &a;
        *b[i]= &b;
    }
    for(i=0;i<n;i++)
    s = *a[i]*b[i];
    return s;
    
}
void main()
{
    product_sum(5,6,7);
}
#include<stdio.h>
int fun()
{
   int count = 0;
  count++;
  return count;
}
  
int main()
{
  printf("%d ", fun());
  printf("%d ", fun());
  return 0;
}
#include <stdio.h>
int *divisible(int *a,int k,int n);
int *divisible(int *a,int k,int n)
{
    int arr[n], arr1[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d", arr[i]);
    }
    for(int i=0;i<n;i++)
    {
        if(arr[i]%k==0)
        arr[]
    }
}
#include <stdio.h>
void area_peri(int r, float *a, float *p);
int main()
{
    int radius ;
    float area , perimeter ;
    printf("Enter radius");
    scanf("%d", &radius);
    area_peri(radius, &area, &perimeter);
    printf("Area is %f\n", area);
    printf("Perimeter is %f\n", perimeter);
    return 0;
}
void area_peri(int r,float *a,float *p)
{
    *a= 3.14*r*r;
    *p= 2*3.14*r;
}
#include <stdio.h>
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
        printf("\nStudent name");
        scanf("%s", s[i].name);        
    }
    for(j=0;j<3;i++)
    {
        printf("\nStudent marks");
        scanf("%d", &s[i].marks);
    }
    for(i=0;i<3;i++)
    {
        printf("Students name are%s", s[i].name);
        printf("Students marks are%d", s[i].marks);
    }
};
int main()
{
    print();
    return 0;
}
#include <stdio.h>
struct Books
{
    int c;
    float sum;
};
int main()
{
    struct Books b1;
    scanf("%d ", &b1.c);
    b1.sum = b1.c*3.00;
    printf("The final output is %.2f", b1.sum);
    return 0;
}
#include <stdio.h>
int main()
{
    int n;
    int arr[]={1,2,3,4,5};
     n = sizeof(arr) ;
    printf("%d", n);
    return 0;
}
#include<stdio.h>
struct pair 
{
  int min;
  int max;
};  
  
struct pair getMinMax(int arr[], int n)
{
  struct pair minmax;     
  int i;
    
  If there is only one element then return it as min and max both
  if (n == 1)
  {
     minmax.max = arr[0];
     minmax.min = arr[0];     
     return minmax;
  }    
  
   If there are more than one elements, then initialize min 
      and max
  if (arr[0] > arr[1])  
  {
      minmax.max = arr[0];
      minmax.min = arr[1];
  }  
  else
  {
      minmax.max = arr[1];
      minmax.min = arr[0];
  }    
  
  for (i = 2; i<n; i++)
  {
    if (arr[i] >  minmax.max)      
      minmax.max = arr[i];
    
    else if (arr[i] <  minmax.min)      
      minmax.min = arr[i];
  }
    
  return minmax;
}
  
 Driver program to test above function 
int main()
{
  int arr[] = {1000, 11, 445, 1, 330, 3000};
  int arr_size = 6;
  struct pair minmax = getMinMax (arr, arr_size);
  printf("nMinimum element is %d\n", minmax.min);
  printf("nMaximum element is %d", minmax.max);
  getchar();
}
#include <stdio.h>
int main()
{
    int n,i,j;
    scanf("%d", &n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d", &arr[i]);
    }
    //n = sizeof(arr)/sizeof(arr[0]);
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(arr[i] == arr[j])
            printf("%d\n", arr[j]);
        }
    }
}*/