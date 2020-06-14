#include <iostream>
#include <algorithm>
using namespace std;
long long arr[100001];
long long sorted[100001];

int main() {

	int n;
	cin >> n;

	for (int i = 0; i < n; i++) {
		cin >> arr[i];
		sorted[i] = arr[i];
	}

	sort(sorted, sorted + n);

	for (int i = 1; i < n; i++) {
		arr[i] += arr[i - 1];
		sorted[i] += sorted[i - 1];
	}

	int t ;
	cin >> t;
	while (t--) {

		int type, l, r;
		cin >> type >> l >> r;
		r--;
		l--;
		if (type == 1) {
			if (l == 0) {
				cout << arr[r] << endl;
			} else {
				cout << arr[r] - arr[l - 1] << endl;
			}
		} else {
			if (l == 0) {
				cout << sorted[r] << endl;
			} else {
				cout << sorted[r] - sorted[l - 1] << endl;
			}
		}
	}

}