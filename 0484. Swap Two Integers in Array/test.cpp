#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 0484. Swap Two Integers in Array")
{
	Solution sol;
	vector<int> nums, expected;
	int index1, index2;

	SUBCASE("Test 1")
	{
		nums = {1, 2, 3, 4};
		expected = {1, 2, 4, 3};
		index1 = 2;
		index2 = 3;
		sol.swapIntegers(nums, index1, index2);
		CHECK(nums == expected);
	}
	SUBCASE("Test 2")
	{
		nums = {1, 2, 2, 2};
		expected = {2, 2, 2, 1};
		index1 = 0;
		index2 = 3;
		sol.swapIntegers(nums, index1, index2);
		CHECK(nums == expected);
	}
}
