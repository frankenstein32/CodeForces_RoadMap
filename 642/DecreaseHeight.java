import java.util.*;

public class DecreaseHeight {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {


		int t = scn.nextInt();

		while (t-- > 0) {

			int n = (int)input();
			int m = (int)input();

			long[][] arr = new long[n][m];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = input();
				}
			}

			long a00 = arr[0][0];
			long ans = Long.MAX_VALUE;

			for (int x = 0; x < n; x++) {
				for (int y = 0; y < m; y++) {

					long need = arr[x][y] - x - y;
					if (need > a00) {
						continue;
					}

					arr[0][0] = need;
					long[][] dp = new long[n][m];
					for (long[] d : dp)
						Arrays.fill(d, Long.MAX_VALUE);
					dp[0][0] = a00 - need;

					for (int i = 0; i < n; i++) {
						for (int j = 0; j < m; j++) {

							need = arr[0][0] + i + j;
							if (need > arr[i][j]) continue;

							if (j > 0)
								dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + arr[i][j] - need);
							if (i > 0)
								dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + arr[i][j] - need);
						}
					}
					ans = Math.min(ans, dp[n - 1][m - 1]);

				}
			}

			print(ans, true);
		}

	}

	public static <T> void print(T t, boolean ln) {

		System.out.print(t);
		if (ln) System.out.println();
	}

	public static long input() {
		return scn.nextLong();
	}


}