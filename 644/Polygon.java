import java.util.*;

public class Polygon {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			int n = scn.nextInt();

			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				String str = scn.next();
				for (int j = 0; j < str.length(); j++) {
					arr[i][j] = str.charAt(j) - '0';
				}
			}

			if (helper(arr, n)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static boolean helper(int[][] arr, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (i == n - 1 || j == n - 1 || arr[i][j] == 0) {
					continue;
				}

				if (arr[i + 1][j] == 1 || arr[i][j + 1] == 1) {
					continue;
				}

				return false;

			}
		}

		return true;
	}
}