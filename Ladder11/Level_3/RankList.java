import java.util.*;
import java.io.*;
public class RankList {
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

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		int k = (int)input();
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = (int)input();
			arr[i][1] = (int)input();
		}

		Arrays.sort(arr, (a, b) -> (a[0] != b[0] ? b[0] - a[0] : a[1] - b[1]));
		int[] pair = arr[k - 1];

		int idx1 = k - 1, idx2 = k - 1;
		while (idx1 >= 0 && arr[idx1][0] == pair[0] && arr[idx1][1] == pair[1]) idx1--;
		idx1++;
		while (idx2 < n && arr[idx2][0] == pair[0] && arr[idx2][1] == pair[1]) idx2++;
		idx2--;

		print(idx2 - idx1 + 1);

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
}