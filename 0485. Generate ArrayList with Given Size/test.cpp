#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 0485. Generate ArrayList with Given Size")
{
	Solution sol;
	int size;
	vector<int> nums;

	SUBCASE("Test 1")
	{
		size = 4;
		nums = {1, 2, 3, 4};
		CHECK(sol.generate(size) == nums);
	};
}
