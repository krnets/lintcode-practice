#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 216 - Substring Rotation")
{
	Solution sol;
	string s1, s2;

	SUBCASE("Test 1")
	{
		s1 = "waterbottle";
		s2 = "erbottlewat";
		CHECK(sol.isRotation(s1, s2) == true);
		// "waterbottle" is a rotation of "erbottlewat".
	}
	SUBCASE("Test 2")
	{
		s1 = "apple";
		s2 = "ppale";
		CHECK(sol.isRotation(s1, s2) == false);
		// "apple" is not a rotation of "ppale".
	}
	SUBCASE("Test 3")
	{
		s1 = "abba";
		s2 = "bbaa";
		CHECK(sol.isRotation(s1, s2) == true);
	}
}
