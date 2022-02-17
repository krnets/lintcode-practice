#include <algorithm>
#include <vector>

using namespace std;

class Solution
{
public:
	void wiggleSort(vector<int>& nums)
	{
		if (!nums.empty())
		{
			sort(nums.begin(), nums.end());

			for (int i = 1; i < nums.size() - 1; i += 2)
			{
				swap(nums[i], nums[i + 1]);
			}
		}
	}
};
