#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	void swapIntegers(vector<int>& A, int index1, int index2)
	{
		int temp = A[index1];
		A[index1] = A[index2];
		A[index2] = temp;
	}
};
