#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	vector<string> printX(int n)
	{
		vector<string> vec(n, string(n, ' '));

		for (int i = 0; i < n; ++i)
		{
			vec[i][i] = 'X';
			vec[i][n - i - 1] = 'X';
		}

		return vec;
	}
};
