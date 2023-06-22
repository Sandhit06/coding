#include <iostream>
using namespace std;
void Rotate(int arr[], int d, int n)
{
    int t[n];
     int k=0,i;
     for(i=d;i<n;i++)
     {
        t[k]= arr[i];
        k++;
     }
     for(i=0;i<d;i++)
     {
        t[k]= arr[i];
        k++;
     }
     for(i=0;i<n;i++)
     {
        arr[i]=t[i];
     }
}
void Print(int arr[],int n)
{
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
}
int main()
{
    int n,i,d;
    cout << "Enter n" <<endl;
    cin >> n;
    int arr[n];
    for(i=0;i<n;i++)
    {
        cin >> arr[i];
    }
    cout << "Enter d" <<endl;
    cin >> d;
    //int n = sizeof(arr)/sizeof(arr[0]);
    Rotate(arr,d,n);
    Print(arr,n);
}