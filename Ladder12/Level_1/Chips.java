import java.util.*;
import java.io.*;

public class Chips {

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		int m = (int)input();

		int lo = 1;
		int hi = n * (n + 1) / 2;
		m = m % hi;
		int ans = 0;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;

			if (mid * (mid + 1) / 2 == m) {
				print(0);
				return;
			} else if (mid * (mid + 1) / 2 < m) {
				ans = m - ((mid * (mid + 1)) / 2);
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		print(ans);

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

	public static <T> void println(T t) {
		print(t);
		System.out.println();
	}

	static FastScanner scn = new FastScanner(System.in);

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