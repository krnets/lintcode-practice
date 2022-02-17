#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 2506 - Remove the Invalid Parentheses")
{
	Solution sol;
	string s;

	SUBCASE("Test 1")
	{
		s = "a(b(c(de)fgh)";
		set<string> expSet{"ab(c(de)fgh)", "a(bc(de)fgh)", "a(b(cde)fgh)"};
		CHECK(expSet.count(sol.removeParentheses(s)) == 1);
	}
	SUBCASE("Test 2")
	{
		s = "(((";
		CHECK(sol.removeParentheses(s) == "");
	}
}
