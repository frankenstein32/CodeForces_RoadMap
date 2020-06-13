import java.util.StringTokenizer;
import java.io.*;

public class CutRibbon {
	static FastScanner scn = new FastScanner(System.in);
	static int[] strg = new int[4001];

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		int a = (int)input();
		int b = (int)input();
		int c = (int)input();

		print(helper(n, a, b, c));

	}

	public static int helper(int n, int... abc) {

		if (n == 0) {
			return 0;
		}

		if (strg[n] != 0) {
			return strg[n];
		}

		int a = -1, b = -1, c = -1;
		if (n >= abc[0]) {
			a = helper(n - abc[0], abc);
		}

		if (n >= abc[1]) {
			b = helper(n - abc[1], abc);
		}

		if (n >= abc[2]) {
			c = helper(n - abc[2], abc);
		}

		if (a == -1 && b == -1 && c == -1) {
			return strg[n] = -1;
		}
		return strg[n] = Math.max(a, Math.max(b, c)) + 1;

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