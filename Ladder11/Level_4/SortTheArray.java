import java.util.*;
import java.io.*;

public class SortTheArray {

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		long[] arr = new long[n];
		TakeInput(arr);
		long[] dup = arr.clone();

		Arrays.sort(dup);
		int i = 0, j = n - 1;
		while (i < n && dup[i] == arr[i]) i++;
		while (j >= 0 && dup[j] == arr[j]) j--;
		if (i > j) {
			println("yes");
			print(1 + " " + 1);
			return;
		}
		int si = i + 1, ei = j + 1;
		while (i < ei - 1) {
			if (arr[i] != dup[j]) {
				println("no");
				return;
			}
			i++;
			j--;
		}

		println("yes");
		print(si + " " + ei);

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