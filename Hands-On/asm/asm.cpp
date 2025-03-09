#include <iostream>
int asmGlobalInit = 10;
int asmGlobalUnInit;

using namespace std;
int asmSum(int a, int b){
    return a + b;
}


int main(){
    int asmLocalVar = 11;
    int asmLocalVarReturn = asmSum(12, 13);

    int* asmMallocVar = (int*)malloc(50);

    cout<<"program is OK.";

    int c;
    cin>>c;
    return 0;
}
