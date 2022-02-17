#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	bool isAlphanumeric(char c)
	{
		return (c >= '0' and c <= '9') or
			(c >= 'A' and c <= 'Z') or
			(c >= 'a' and c <= 'z');
	}
};
