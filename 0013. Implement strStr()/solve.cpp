#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	int strStr(string& source, string& target)
	{
		if (source.length() < target.length())
			return -1;

		if (source.empty())
			return 0;

		int len = target.length();

		for (int i = 0; i <= source.length() - len; ++i)
			if (source.substr(i, len) == target)
				return i;

		return -1;
	}
};
