#include <bits/stdc++.h>

using namespace std;

class Solution
{
public:
	char longestLightingTime(vector<vector<int>>& operation)
	{
		int longest = 0;
		int prev = 0;
		int idx = 0;

		for (auto& op : operation)
		{
			int start = op[0];
			int ends = op[1];
			int diff = ends - prev;

			if (diff > longest)
			{
				longest = diff;
				idx = start;
			}
			prev = ends;
		}

		return idx + 'a';
	}
};
