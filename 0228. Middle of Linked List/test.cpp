#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 0225. Find Node in Linked List")
{
	Solution s;

	SUBCASE("Test 1")
	{
		ListNode* head = new ListNode(1);
		head->next = new ListNode(2);
		head->next->next = new ListNode(3);
		ListNode* res = s.middleNode(head);

		CHECK(res->val == head->next->val);
	}
	SUBCASE("Test 2")
	{
		ListNode* head = new ListNode(1);
		head->next = new ListNode(2);
		ListNode* res = s.middleNode(head);

		CHECK(res->val == head->val);
	}
	SUBCASE("Test 3")
	{
		ListNode* head = nullptr;
		ListNode* res = s.middleNode(head);
		CHECK(!res);
	}
	SUBCASE("Test 4")
	{
		ListNode* head = new ListNode(1);
		head->next = new ListNode(3);
		head->next->next = new ListNode(2);
		head->next->next->next = new ListNode(4);
		head->next->next->next->next = new ListNode(6);
		head->next->next->next->next->next = new ListNode(7);
		ListNode* res = s.middleNode(head);

		CHECK(res->val == head->next->next->val);
	}
}
