#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 1905 - Character deletion")
{
	Solution s;
	string str, sub, expected;

	SUBCASE("Test 1")
	{
		str = "They are students";
		sub = "aeiou";
		expected = "Thy r stdnts";
		CHECK(s.CharacterDeletion(str, sub) == expected);
	}
}
