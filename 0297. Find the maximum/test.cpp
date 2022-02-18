#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 0283. Max of 3 Numbers")
{
	Solution sol;

	SUBCASE("Test 1")
	{
		CHECK(sol.maxOfThreeNumbers(1,9,3) == 9);
	}
	SUBCASE("Test 2")
	{
		CHECK(sol.maxOfThreeNumbers(1,2,3) == 3);
	}
}
