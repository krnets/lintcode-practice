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
	vector<int> toArrayList(ListNode* head)
	{
		vector<int> vec;

		while (head)
		{
			vec.push_back(head->val);
			head = head->next;
		}
		return vec;
	}
};
