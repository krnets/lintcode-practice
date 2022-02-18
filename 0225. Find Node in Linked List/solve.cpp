#include <bits/stdc++.h>

using namespace std;

class ListNode
{
public:
	int val;
	ListNode* next;

	ListNode(int val) : val(val), next(nullptr)
	{
	}
};

class Solution
{
public:
	ListNode* findNode(ListNode* head, int val)
	{
		if (!head) return nullptr;

		while (head)
		{
			if (head->val == val)
				return head;

			head = head->next;
		}
	}
};
