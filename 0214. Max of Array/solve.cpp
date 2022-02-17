#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	float maxOfArray(vector<float>& A)
	{
		float ans = A.front();

		for (float num : A)
			if (num > ans)
				ans = num;

		return ans;
	}
};
