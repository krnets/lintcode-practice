#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	int reverseInteger(int number)
	{
		int ans = 0;

		while (number != 0)
		{
			ans = 10 * ans + number % 10;
			number /= 10;
		}

		return ans;
	}
};
