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
	ListNode* middleNode(ListNode* head)
	{
		if (!head) return nullptr;

		auto slow = head;
		auto fast = head->next;

		while (fast && fast->next)
		{
			slow = slow->next;
			fast = fast->next->next;
		}

		return slow;
	}
};
