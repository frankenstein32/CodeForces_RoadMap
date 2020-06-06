import java.util.*;

public class SpyStrings {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			int n = scn.nextInt();
			int m = scn.nextInt();

			char[][] arr = new char[n][m];
			for (int i = 0; i < n; i++) {
				String str = scn.next();
				for (int j = 0; j < str.length(); j++) {
					arr[i][j] = str.charAt(j);
				}
			}

			helper(arr);

		}
	}

	public static void helper(char[][] arr) {
		char[] ans = arr[0];
		for (int i = 0; i < arr[0].length; i++) {
			char save = ans[i];
			for (char d = 'a'; d <= 'z'; d++) {
				ans[i] = d;

				if (compare(ans, arr)) {
					System.out.println(ans);
					return;
				}

				ans[i] = save;
			}
		}

		System.out.println(-1);
	}

	public static boolean compare(char[] ans, char[][] arr) {


		for (int i = 0; i < arr.length; i++) {
			int diff = 0;
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] != ans[j]) {
					diff++;
				}
			}

			if (diff > 1) {
				return false;
			}
		}

		return true;
	}
}