#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int tt; cin>>tt;
	while(tt--)
	{
	    long n; cin>>n;
	    long a[n];
	    long sum = -n;
	    long mx = 0;
	    for(long i = 0; i < n; i++)
	    {
	        cin>>a[i];
	        sum += a[i];
	        mx = max(mx, a[i]);
	    }
	    sum++;
	    cout<<max(sum, mx)<<endl;
	}
	return 0;
}
