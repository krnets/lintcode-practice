#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 0466. Count Linked List Nodes")
{
	Solution sol;

	SUBCASE("Test 1")
	{
		auto head = new ListNode(1);
		head->next = new ListNode(3);
		head->next->next = new ListNode(5);
		CHECK(sol.countNodes(head) == 3);
	}
	SUBCASE("Test 2")
	{
		ListNode* head = nullptr;
		CHECK(sol.countNodes(head) == 0);
	}
}
