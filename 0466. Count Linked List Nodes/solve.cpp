#include <bits/stdc++.h>
using namespace std;

class ListNode
{
public:
	int val;
	ListNode* next;

	ListNode(int val)
	{
		this->val = val;
		this->next = NULL;
	}
};


class Solution
{
public:
	int countNodes(ListNode* head)
	{
		if (!head) return 0;

		int ans = 0;

		while (head)
		{
			++ans;
			head = head->next;
		}
		return ans;
	}
};
