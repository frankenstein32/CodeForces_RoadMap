import java.util.*;
import java.io.*;

public class LuckyDivision {

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		if (isLucky(n)) {
			print("YES");
			return;
		}

		for (int i = 1; i < n; i++) {

			if (isLucky(i) && n % i == 0) {
				print("YES");
				return;
			}
		}

		print("NO");

	}

	public static boolean isLucky(int val) {

		while (val > 0) {
			if (val % 10 != 4 && val % 10 != 7) {
				return false;
			}

			val /= 10;
		}

		return true;
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