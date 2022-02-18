#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 0463. Sort Integers")
{
	Solution sol;
	vector<int> nums, expected;

	SUBCASE("Test 1")
	{
		nums = {3, 2, 1, 4, 5};
		expected = {1, 2, 3, 4, 5};
		sol.sortIntegers(nums);
		CHECK(nums == expected);
	}
	SUBCASE("Test 2")
	{
		nums = {1, 1, 2, 1, 1};
		expected = {1, 1, 1, 1, 2};
		sol.sortIntegers(nums);
		CHECK(nums == expected);
	}
}
