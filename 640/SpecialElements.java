import java.util.*;

public class SpecialElements {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = (int)input();

		while (t-- > 0) {
			int n = (int)input();
			int[] arr = new int[n];
			int[] cnt = new int[n + 1];
			for (int i = 0; i < n; i++) {
				arr[i] = (int)input();
				cnt[arr[i]]++;
			}

			int ans = 0;

			for (int l = 0; l < n; l++) {
				int sum = 0;
				for (int r = l; r < n; r++) {

					sum += arr[r];
					if (l == r) {
						continue;
					}

					if (sum <= n) {
						ans += cnt[sum];
						cnt[sum] = 0;
					}
				}
			}

			print(ans, true);

		}


	}

	public static long input() {
		return scn.nextLong();
	}

	public static <T> void print(T t, boolean ln) {
		System.out.print(t);
		if (ln) System.out.println();
	}
}