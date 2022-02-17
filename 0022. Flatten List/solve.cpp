#include <stack>
#include <vector>
using namespace std;

// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
class NestedInteger
{
public:
	// Return true if this NestedInteger holds a single integer,
	// rather than a nested list.
	bool isInteger() const;

	// Return the single integer that this NestedInteger holds,
	// if it holds a single integer
	// The result is undefined if this NestedInteger holds a nested list
	int getInteger() const;

	// Return the nested list that this NestedInteger holds,
	// if it holds a nested list
	// The result is undefined if this NestedInteger holds a single integer
	const vector<NestedInteger>& getList() const;
};

class Solution
{
public:
	vector<int> flatten(vector<NestedInteger>& nestedList)
	{
		vector<int> vec;
		stack<NestedInteger> stk;
		int n = nestedList.size();

		for (int i = n - 1; i >= 0; --i)
		{
			stk.push(nestedList[i]);
		}

		while (!stk.empty())
		{
			auto curr = stk.top();
			stk.pop();

			if (curr.isInteger())
			{
				vec.push_back(curr.getInteger());
			}
			else
			{
				auto intList = curr.getList();

				for (int i = intList.size() - 1; i >= 0; --i)
				{
					stk.push(intList[i]);
				}
			}
		}
		return vec;
	}
};
