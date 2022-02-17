#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	int stringToInteger(string& target)
	{
		bool neg = false;
		int ans = 0;

		if (target.front() == '-')
		{
			neg = true;
			target.erase(0, 1);
		}

		for (char c : target)
			ans = ans * 10 + (c - '0');

		return neg ? -ans : ans;
	}
};
