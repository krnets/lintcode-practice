#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN
#include <doctest/doctest.h>
#include "solve.cpp"

TEST_CASE("testing 1910 - Most numbers")
{
	Solution s;
	vector<int> nums;

	SUBCASE("Test 1")
	{
		nums = {1, 1, 2, 3, 3, 3, 4, 5};
		CHECK(s.findNumber(nums) == 3);
	}
	SUBCASE("Test 2")
	{
		nums = {1};
		CHECK(s.findNumber(nums) == 1);
	}
	SUBCASE("Test 3")
	{
		nums = {1, 2};
		CHECK(s.findNumber(nums) == 1);
	}
	SUBCASE("Test 4")
	{
		ifstream file;
		file.open("testdatav2_1910_data_5.in", ios::in);
		string token;
		nums.clear();

		while (getline(file, token, ','))
			nums.push_back(stoi(token));
		file.close();

		CHECK(s.findNumber(nums) == 3);
	}
	SUBCASE("Test 5")
	{
		ifstream file;
		file.open("testdatav2_1910_data_10.in", ios::in);
		string token;
		nums.clear();

		while (getline(file, token, ','))
			nums.push_back(stoi(token));
		file.close();

		CHECK(s.findNumber(nums) == 26463642);
	}
}
