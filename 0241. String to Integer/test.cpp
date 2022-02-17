#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 241 - String to Integer")
{
	Solution sol;
	string s;

	SUBCASE("Test 1")
	{
		s = "123";
		CHECK(sol.stringToInteger(s) == 123);
	}
	SUBCASE("Test 2")
	{
		s = "-123";
		CHECK(sol.stringToInteger(s) == -123);
	}
}
