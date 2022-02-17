#include <vector>
#include <unordered_map>

class Solution
{
public:
	int findNumber(std::vector<int>& array)
	{
		std::unordered_map<int, int> freq;
		int ans = 0;
		int mxn = 0;

		for (int x : array)
		{
			freq[x]++;
		}

		for (auto [x, counts] : freq)
		{
			if (counts > mxn)
			{
				mxn = counts;
				ans = x;
			}
			else if (counts == mxn && x < ans)
			{
				ans = x;
			}
		}

		return ans;
	}
};
