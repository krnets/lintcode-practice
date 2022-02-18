#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 0037. Reverse 3-digit Integer")
{
	Solution sol;

	SUBCASE("Test 1")
	{
		int num = 123;
		CHECK(sol.reverseInteger(num) == 321);
	}
	SUBCASE("Test 2")
	{
		int num = 900;
		CHECK(sol.reverseInteger(num) == 9);
	}
}
