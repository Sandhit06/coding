/*#include <iostream>
using namespace std;
int main()
{
    cout << "Hello World";
    return 0;
}
#include <iostream>
#include <string>
using namespace std;
int main()
{
    string firstName;
    cout << "Type your first name: ";
    getline (cin ,firstName); // get user input from the keyboard
    cout << "Your name is: " << firstName;
    return 0;
}
#include <iostream>
using namespace std;
 
template<typename t1,typename t2>
void sum(t1 a,t2 b) 
{
    cout<<"Sum="<<a+b<<endl;
}
 
int main()
{
    int a,b;
    float x,y;
    cout<<"Enter two integer data: ";
    cin>>a>>b;
    cout<<"Enter two float data: ";
    cin>>x>>y;
    sum(a,b); 
    sum(x,y);      
}*/
#include <iostream>
using namespace std;

template <class T, class U>
class A {
	T x;
	U y;

public:
	A()
	{
		cout << "Constructor Called" <<
         endl;
	}
};

int main()
{
	A<char, char> a;
	A<int, double> b;
	return 0;
}