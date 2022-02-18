#include <bits/stdc++.h>

using namespace std;

class Solution
{
public:
	string compress(string& originalString)
	{
		string ans;
		int left = 0;
		int n = originalString.length();

		while (left < n)
		{
			int right = left + 1;

			while (right < n && originalString[left] == originalString[right])
				++right;

			ans.push_back(originalString[left]);

			ans += std::to_string(right - left);

			left = right;
		}

		return ans.length() < n ? ans : originalString;
	}
};
