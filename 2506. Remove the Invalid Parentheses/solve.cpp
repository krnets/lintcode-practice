#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
	string removeParentheses(string& s)
	{
		string ret;
		stack<int> stk;
		set<int> set;

		for (int i = 0; i < s.length(); ++i)
		{
			char c = s[i];

			if (c == '(')
				stk.push(i);

			else if (c == ')')
			{
				if (stk.empty())
					set.insert(i);
				else
					stk.pop();
			}
		}

		while (!stk.empty())
		{
			set.insert(stk.top());
			stk.pop();
		}

		for (int i = 0; i < s.length(); ++i)
			if (!set.count(i))
				ret += s[i];

		return ret;
	}
};
