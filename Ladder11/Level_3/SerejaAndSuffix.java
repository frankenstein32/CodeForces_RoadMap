import java.util.*;
import java.io.*;

public class SerejaAndSuffix {
	static int[] set = new int[1_000_01];
	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		int m = (int)input();
		int[] arr = new int[n];
		TakeInput(arr);

		HashMap<Integer, Integer> map = new HashMap<>();
		int cnt = 0;
		for (int i = n - 1; i >= 0; i--) {
			set[arr[i]]++;
			if (set[arr[i]] == 1)
				cnt++;
			map.put(i + 1, cnt);
		}

		while (m-- > 0) {
			int idx = (int)input();
			print(map.get(idx));
			print();
		}
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