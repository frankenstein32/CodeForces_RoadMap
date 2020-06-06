#include <bits/stdc++.h>

using namespace std;

int main() {
#ifdef _DEBUG
	freopen("input.txt", "r", stdin);
//	freopen("output.txt", "w", stdout);
#endif

	auto solve = [](const string & s) {
		int n = s.size();
		int all = count(s.begin(), s.end(), '1');
		int ans = all;
		vector<int> res(n);
		int pref = 0;
		for (int i = 0; i < n; ++i) {
			int cur = (s[i] == '1');
			pref += cur;
			res[i] = 1 - cur;
			if (i > 0) res[i] += min(res[i - 1], pref - cur);
			ans = min(ans, res[i] + all - pref);
		}
		return ans;
	};

	int t;
	cin >> t;
	while (t--) {
		int n, k;
		string s;
		cin >> n >> k >> s;
		vector<string> val(k);
		int cnt = count(s.begin(), s.end(), '1');
		for (int i = 0; i < n; ++i) {
			val[i % k] += s[i];
		}
		int ans = 1e9;
		for (auto &it : val) ans = min(ans, solve(it) + (cnt - count(it.begin(), it.end(), '1')));
		cout << ans << endl;
	}

	return 0;
}