#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 25 - Print X")
{
	Solution s;
	vector<string> expected;

	SUBCASE("Test 1")
	{
		expected = {"X"};
		CHECK(s.printX(1) == expected);
	}
	SUBCASE("Test 2")
	{
		expected = {"XX", "XX"};
		CHECK(s.printX(2) == expected);
	}
	SUBCASE("Test 3")
	{
		expected = {"X X", " X ", "X X"};
		CHECK(s.printX(3) == expected);
	}
	SUBCASE("Test 4")
	{
		expected = {"X  X", " XX ", " XX ", "X  X"};
		CHECK(s.printX(4) == expected);
	}
	SUBCASE("Test 5")
	{
		expected = {"X   X", " X X ", "  X  ", " X X ", "X   X"};
		CHECK(s.printX(5) == expected);
	}
}
