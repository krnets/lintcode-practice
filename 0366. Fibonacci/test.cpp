#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 366 - Fibonacci")
{
	Solution s;

	SUBCASE("Test 1")
	{
		CHECK(s.fibonacci(1) == 0);
	}
	SUBCASE("Test 2")
	{
		CHECK(s.fibonacci(2) == 1);
	}
	SUBCASE("Test 3")
	{
		CHECK(s.fibonacci(3) == 1);
	}
	SUBCASE("Test 4")
	{
		CHECK(s.fibonacci(4) == 2);
	}
	SUBCASE("Test 5")
	{
		CHECK(s.fibonacci(5) == 3);
	}
	SUBCASE("Test 6")
	{
		CHECK(s.fibonacci(6) == 5);
	}
	SUBCASE("Test 7")
	{
		CHECK(s.fibonacci(7) == 8);
	}
	SUBCASE("Test 8")
	{
		CHECK(s.fibonacci(8) == 13);
	}
	SUBCASE("Test 9")
	{
		CHECK(s.fibonacci(9) == 21);
	}
	SUBCASE("Test 10")
	{
		CHECK(s.fibonacci(10) == 34);
	}
}
