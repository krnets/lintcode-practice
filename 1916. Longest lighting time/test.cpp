#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 1916. Longest lighting time")
{
	Solution s;
	vector<vector<int>> ops;

	SUBCASE("Test 1")
	{
		ops = {{0, 2}, {1, 5}, {0, 9}, {2, 15}};
		CHECK(s.longestLightingTime(ops) == 'c');

		/* At 0-th second, the lamps will accept the operation `[0, 2]`,
		so the lamp0 will turn on, and it will turn off at the 2-nd second.
		It will lighting `2-0 = 2` seconds.

		At 2-nd second, the lamps will accept the operation `[1, 5]`,
		so the lamp1 will turn on, and it will turn off at the 5-th second.
		It will lighting `5-2 = 3` seconds.

		At 5-th second, the lamps will accept the operation `[0, 9]`,
		so the lamp0 will turn on, and it will turn off at the 9-th second.
		It will lighting `9-5 = 4` seconds.

		At 9-th second, the lamps will accept the operation `[2, 15]`,
		so the lamp2 will turn on, and it will turn off at the 15-th second.
		It will lighting `15-9 = 6` seconds.

		So the longest continuously lighting time is `max(2, 3, 4, 6) = 6` seconds.
		
		**You need to return a lowercase letter instead of a number, such as `'a' = 0, 'b' = 1, ..., 'z' = 25`.**
		So the answer to the above example is 'c'.  */
	}
}
