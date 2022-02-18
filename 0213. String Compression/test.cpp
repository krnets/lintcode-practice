#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 0213. String Compression")
{
	Solution s;
	string str, expected;

	SUBCASE("Test 1")
	{
		str = "aabcccccaaa";
		//      ^
		//     p
		expected = "a2b1c5a3";
		CHECK(s.compress(str) == expected);
	}
	SUBCASE("Test 2")
	{
		str = "aabbcc";
		expected = "aabbcc";
		CHECK(s.compress(str) == expected);
	}
}
