// https://cses.fi/problemset/task/1068
#include<bits/stdc++.h>
using namespace std;
int main(){
    long long n;
    cin>>n;
    
    while(n>1){
        cout << n << " ";
        n = ( n&1) ? n*3+1:n/2;  
    }
    cout << 1;
    return 0;
}