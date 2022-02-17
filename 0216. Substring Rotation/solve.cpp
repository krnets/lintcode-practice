#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	bool isRotation(string& s1, string& s2)
	{
		if (s1.empty() || s1.size() != s2.size()) return false;

		vector<int> indices;
		char c = s1.front();
		string t;

		for (int i = 0; i < s1.length(); ++i)
			if (s2[i] == c)
				indices.push_back(i);

		for (int index : indices)
		{
			t = s2.substr(index) + s2.substr(0, index);

			if (t == s1) return true;
		}
		return false;
	}
};
