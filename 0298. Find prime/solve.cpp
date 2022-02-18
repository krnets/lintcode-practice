#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	bool is_prime(int n)
	{
		if (n == 2 || n == 3 || n == 5) return true;
		if (n < 2 || n % 2 == 0 || n % 3 == 0 || n % 5 == 0) return false;

		for (int i = 5; i <= sqrt(n); i += 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}

	vector<int> prime(int n)
	{
		vector<int> vec;

		for (int i = 1; i <= n; ++i)
			if (is_prime(i))
				vec.push_back(i);

		return vec;
	}
};
