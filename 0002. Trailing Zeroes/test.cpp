#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 0002. Trailing Zeroes")
{
	Solution sol;
	long long n;

	SUBCASE("Test 1")
	{
		n = 5;
		CHECK(sol.trailingZeros(n) == 1);
		// 5! = 120, 1 trailing zero.
	}
	SUBCASE("Test 2")
	{
		n = 11;
		CHECK(sol.trailingZeros(n) == 2);
		// 11! = 39916800, 2 trailing zeros.
	}
	SUBCASE("Test 3")
	{
		n = 105;
		CHECK(sol.trailingZeros(n) == 25);
		// 105! is exactly:
		// 1081396758240290900504101305800329649720646107774902579144176636573226531909905153326984536526808240339776398934872029657993872907813436816097280000000000000000000000000
		// 25 trailing zeros.
	}
	SUBCASE("Test 4")
	{
		n = 78;
		CHECK(sol.trailingZeros(n) == 18);
	}
	SUBCASE("Test 5")
	{
		n = 20;
		CHECK(sol.trailingZeros(n) == 4);
	}
}
