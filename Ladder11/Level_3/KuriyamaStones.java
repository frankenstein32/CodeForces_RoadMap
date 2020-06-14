import java.util.*;
import java.io.*;

public class KuriyamaStones {

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)(input());
		long[] arr = new long[n];
		TakeInput(arr);
		long[] sorted = arr.clone();
		Arrays.sort(sorted);
		for (int i = 1; i < n; i++) {
			arr[i] += arr[i - 1];
			sorted[i] += sorted[i - 1];
		}

		int t = (int)input();
		while (t-- > 0) {

			int type = (int)input();
			int l = (int)input() - 1;
			int r = (int)input() - 1;

			if (type == 1) {
				if (l == 0) {
					print(arr[r] + "\n");
				} else {
					print(arr[r] - arr[l - 1] + "\n");
				}
			} else {
				if (l == 0) {
					print(sorted[r] + "\n");
				} else {
					print(sorted[r] - sorted[l - 1] + "\n");
				}
			}
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