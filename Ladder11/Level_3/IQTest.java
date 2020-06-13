import java.util.StringTokenizer;
import java.io.*;

public class IQTest {
	static FastScanner scn = new FastScanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = 4;
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			String str = input(1);
			for (int j = 0; j < n; j++) {
				arr[i][j] = str.charAt(j) == '.' ? 0 : 1;
			}
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				int sum = arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1];
				if ( sum <= 1 || sum >= 3 ) {
					print("YES");
					return;
				}
			}
		}

		print("NO");
	}


	public static long input() {
		return scn.input();
	}

	public static String input(int... var) {
		return scn.input(1);
	}

	public static void TakeInput(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int)scn.input();
	}

	public static void TakeInput(long[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.input();
	}

	public static void printArray(int[] arr) {
		for (int val : arr)
			print(val + " ");

		print("\n");
	}

	public static void printArray(long[] arr) {
		for (long val : arr)
			print(val + " ");

		print("\n");
	}

	public static <T> void print(T t) {
		System.out.print(t);
	}
	public static void print() {
		System.out.println();
	}
	private static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String input(int a) {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		long input() {
			return Long.parseLong(input(1));
		}

	}
}