#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

class Solution
{
public:
	ll trailingZeros(ll n)
	{
		ll cnt = 0;
		ll div = 5;

		while (n >= div)
		{
			cnt += n / div;
			div *= 5;
		}

		return cnt;
	}
};
