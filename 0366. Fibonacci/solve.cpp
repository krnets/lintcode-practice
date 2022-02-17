#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	int fibonacci(int n)
	{
		int a = 0, b = 1;

		while (--n)
		{
			int temp = a;
			a = b;
			b += temp;
		}

		return a;
	}
};
