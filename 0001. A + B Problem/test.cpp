#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 1: A + B Problem")
{
	Solution s;

	SUBCASE("Test 1")
	{
		CHECK(s.aplusb(1, 2) == 3);
	}
	SUBCASE("Test 2")
	{
		CHECK(s.aplusb(-1, 1) == 0);
	}
	SUBCASE("Test 3")
	{
		CHECK(s.aplusb(-8, 10) == 2);
	}
}
