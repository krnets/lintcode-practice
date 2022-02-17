#include <algorithm>
#include <vector>

using std::vector, std::swap;

class Solution
{
public:
	void wiggleSort(vector<int>& nums)
	{
		for (int i = 1; i < nums.size(); ++i)
			if (i % 2 == 1 and nums[i - 1] > nums[i] or
				i % 2 == 0 and nums[i - 1] < nums[i])
				swap(nums[i], nums[i - 1]);
	}
};
