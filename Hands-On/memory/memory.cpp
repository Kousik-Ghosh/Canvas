#include <iostream>
#include <limits.h>
#include <bitset>

using namespace std;
int main(){


//     int a = 10;
//     int b = 20;
    
//     int e = 10;
  
//     int g = 50;


// cout<<"a"<<"\n";
//     cout<<a<<"\n";
//     cout<<&a<<"\n";
//     cout<<sizeof(a)<<"\n";
//     cout<<std::bitset<24>(a)<<"\n";
//     cout<<"-----"<<"\n";


// cout<<"b"<<"\n";
//     cout<<b<<"\n";
//     cout<<&b<<"\n";
//     cout<<sizeof(b)<<"\n";
//     cout<<std::bitset<24>(b)<<"\n";
//     cout<<"-----"<<"\n";


// cout<<"e"<<"\n";
//     cout<<e<<"\n";
//     cout<<&e<<"\n";
//     cout<<sizeof(e)<<"\n";
//     cout<<std::bitset<24>(e)<<"\n";
//     cout<<"-----"<<"\n";




// cout<<"g"<<"\n";
//     cout<<g<<"\n";
//     cout<<&g<<"\n";
//     cout<<sizeof(g)<<"\n";
//     cout<<std::bitset<24>(g)<<"\n";
//     cout<<"-----"<<"\n";






    

    

    char c;
    int i = 0;
    char *p = (char*)0xfffffff0;
    while(i <= 50){

        p++;
        cout<<(void *) p<<"\n";
        i++;
    }
    cin>>c;

    return 0;
}