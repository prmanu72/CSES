#include <bits/stdc++.h>
using namespace std;
int main()
{
    long long n;
    cin >> n;
    int ans = 1;
    for (int i = 2; i <= n; i++)
    {
        int k;
        cin>>k;
        ans = ans + i - k;
    }
    cout << ans<< endl;
    return 0;
}