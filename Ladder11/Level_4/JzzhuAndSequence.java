import java.util.*;
import java.io.*;

public class JzzhuAndSequence {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		long f1 = input();
		long f2 = input();
		long n = input() % 6;

		n = (n == 0 ? 6 : n);
		if (n == 1) {
			print(clean(f1));
		} else if (n == 2) {
			print(clean(f2));
		} else if (n == 3) {
			print(clean(f2 - f1));
		} else if (n == 4) {
			print(clean(-f1));
		} else if (n == 5) {
			print(clean(-f2));
		} else if (n == 6) {
			print(clean(f1 - f2));
		}

	}

	public static long clean(long n) {
		return (n + MOD) % MOD;
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