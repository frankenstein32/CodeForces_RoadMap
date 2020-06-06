#include <bits/stdc++.h>

using namespace std;

int main() {
	int t;
	cin >> t;
	while (t--) {
		int n;
		cin >> n;
		vector<int> a(n);
		for (auto &it : a) cin >> it;
		int l = 0, r = n - 1;
		int suml = 0, sumr = 0;
		int cnt = 0, ansl = 0, ansr = 0;
		while (l <= r) {
			if (cnt % 2 == 0) {
				int nsuml = 0;
				while (l <= r && nsuml <= sumr) {
					nsuml += a[l++];
				}
				ansl += nsuml;
				suml = nsuml;
			} else {
				int nsumr = 0;
				while (l <= r && nsumr <= suml) {
					nsumr += a[r--];
				}
				ansr += nsumr;
				sumr = nsumr;
			}
			++cnt;
		}
		cout << cnt << " " << ansl << " " << ansr << endl;
	}
}