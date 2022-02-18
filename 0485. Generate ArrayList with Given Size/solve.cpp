#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	vector<int> generate(int size)
	{
		vector<int> vec(size);
		iota(vec.begin(), vec.end(), 1);

		return vec;
	}
};
