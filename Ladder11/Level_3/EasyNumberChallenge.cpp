#include <iostream>
using namespace std;
int div(int num) {

	int cnt = 0;
	for (int i = 1; i * i <= num; i++) {
		if (num % i == 0) {
			if (i != num / i) {
				cnt ++;
			}
			cnt++;
		}
	}
	return cnt;
}

int main() {

	long long m =  1073741824;
	int a, b, c;
	cin >> a >> b >> c;

	long sum = 0;
	for (int i = 1; i <= a; i++) {
		for (int j = 1; j <= b; j++) {
			for (int k = 1; k <= c; k++) {
				sum = (sum + div(i * j * k)) % m;
			}
		}
	}

	cout << sum;

}