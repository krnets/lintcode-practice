#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

class Solution
{
public:
	ll trailingZeros(ll n)
	{
		ll cnt = 0;

		for (ll i = 5; n / i >= 1; i *= 5)
		{
			cnt += n / i;
		}

		return cnt;
	}
};
