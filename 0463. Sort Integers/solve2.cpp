#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	void sortIntegers(vector<int>& A)
	{
		int n = A.size();

		for (int i = 0; i < n - 1; ++i)
		{
			int min_pos = i;

			for (int j = i + 1; j < n; ++j)
				if (A[j] < A[min_pos])
					min_pos = j;

			swap(A[i], A[min_pos]);
		}
	}
};
