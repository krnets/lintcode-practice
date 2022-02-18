#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 0298. Find prime")
{
	Solution sol;
	vector<int> expected;

	SUBCASE("Test 1")
	{
		int num = 5;
		expected = {2, 3, 5};
		CHECK(sol.prime(num) == expected);
	}
	SUBCASE("Test 2")
	{
		int num = 72;
		expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71};
		CHECK(sol.prime(num) == expected);
	}
}
