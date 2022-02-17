#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 13 - Implement strStr()")
{
	Solution s;
	string source, target;

	SUBCASE("Test 1")
	{
		source = "source";
		target = "target";
		CHECK(s.strStr(source, target) == -1);
	}
	SUBCASE("Test 2")
	{
		source = "abcdabcdefg";
		target = "bcd";
		CHECK(s.strStr(source, target) == 1);
	}
	SUBCASE("Test 3")
	{
		source = "";
		target = "";
		CHECK(s.strStr(source, target) == 0);
	}
	SUBCASE("Test 4")
	{
		source = "";
		target = "a";
		CHECK(s.strStr(source, target) == -1);
	}
	SUBCASE("Test 5")
	{
		source = "abc";
		target = "cdeabcdabc";
		CHECK(s.strStr(source, target) == -1);
	}
}
