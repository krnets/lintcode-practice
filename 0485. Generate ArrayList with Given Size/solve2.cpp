#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	vector<int> generate(int size)
	{
		vector<int> vec;

		for (int i = 1; i <= size; ++i)
			vec.push_back(i);

		return vec;
	}
};
