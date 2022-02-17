#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	string highestFrequency(vector<string>& ipLines)
	{
		unordered_map<string, int> map;

		for (string& ip_line : ipLines)
			map[ip_line]++;

		string ans;
		int mx = 0;

		for (auto [ip, times] : map)
		{
			if (times > mx)
			{
				mx = times;
				ans = ip;
			}
		}

		return ans;
	}
};
