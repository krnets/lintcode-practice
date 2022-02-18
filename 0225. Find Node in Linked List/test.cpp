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
		ListNode* res = s.findNode(head, 3);

		CHECK(res == head->next->next);
	}
	SUBCASE("Test 2")
	{
		ListNode* head = new ListNode(1);
		head->next = new ListNode(2);
		head->next->next = new ListNode(3);
		ListNode* res = s.findNode(head, 4);

		CHECK(!res);
	}
	SUBCASE("Test 3")
	{
		ListNode* head = new ListNode(1);
		head->next = new ListNode(2);
		head->next->next = new ListNode(3);
		ListNode* res = s.findNode(nullptr, 1);

		CHECK(res == nullptr);
	}
}
