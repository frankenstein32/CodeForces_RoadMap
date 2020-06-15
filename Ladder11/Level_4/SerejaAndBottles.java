import java.util.*;
import java.io.*;

public class SerejaAndBottles {

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = (int)input();
			arr[i][1] = (int)input();
		}

		int[] strg = new int[1001];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			strg[arr[i][1]]++;
		}

		for (int i = 0; i < n; i++) {

			strg[arr[i][1]]--;
			if (strg[arr[i][0]] == 0) {
				cnt++;
			}

			strg[arr[i][1]]++;
		}

		print(cnt);
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