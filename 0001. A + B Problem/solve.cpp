#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	int aplusb(int a, int b)
	{
		if (b == 0) return a;

		int sum = a ^ b;
		int carry = (a & b) << 1;

		return aplusb(sum, carry);
	}
};
