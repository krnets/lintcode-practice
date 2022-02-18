#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 483. Convert Linked List to Array List")
{
	Solution sol;
	vector<int> expected;

	SUBCASE("Test 1")
	{
		auto head = new ListNode(1);
		head->next = new ListNode(2);
		head->next->next = new ListNode(3);
		expected = {1, 2, 3};
		CHECK(sol.toArrayList(head) == expected);
	}
	SUBCASE("Test 2")
	{
		auto head = new ListNode(3);
		head->next = new ListNode(5);
		head->next->next = new ListNode(8);
		expected = {3, 5, 8};
		CHECK(sol.toArrayList(head) == expected);
	}
}
