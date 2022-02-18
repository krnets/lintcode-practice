#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	int maxOfThreeNumbers(int num1, int num2, int num3)
	{
		return max(num1, max(num2, num3));
	}
};
