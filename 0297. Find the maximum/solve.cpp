#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	int maxNum(vector<int>& nums)
	{
		int ans = INT_MIN;

		for (int num : nums)
			if (num > ans)
				ans = num;

		return ans;
	}
};
