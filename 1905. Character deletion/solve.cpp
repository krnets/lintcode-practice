#include <unordered_set>
#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	string CharacterDeletion(string& str, string& sub)
	{
		string ans;
		unordered_set<char> set(sub.begin(), sub.end());

		for (char c : str)
			if (!set.count(c))
				ans += c;

		return ans;
	}
};
