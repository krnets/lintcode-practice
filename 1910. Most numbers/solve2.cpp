#include <bits/stdc++.h>

using namespace std;

class Solution
{
public:
	int findNumber(std::vector<int>& array)
	{
		unordered_map<int, int> freq;
		vector<int> v;
		int res = 0;

		for (auto x : array)
			freq[x]++;

		for (auto x : freq)
			res = max(res, x.second);

		for (auto x : freq)
			if (x.second == res)
				v.push_back(x.first);

		return *min_element(v.begin(), v.end());
	}
};
