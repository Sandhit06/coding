#include<iostream>
using namespace std;

int main()
{
int arr[100];
int n,i,j,temp;
cin>>n;
for(i=0;i<n;i++)
{
    cin>>arr[i];
}
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        if(arr[i]>arr[j])
        {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
}
i=0;
for(j=i+1;j<n;j++)
{
    if(arr[i] == arr[j])
    {
        i=i+2;
    }
}
cout<<arr[i];
return 0;
}