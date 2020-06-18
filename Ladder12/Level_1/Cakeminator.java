import java.util.*;
import java.io.*;

public class Cakeminator {

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int row = (int)input();
		int col = (int)input();
		char[][] arr = new char[row][col];

		int res = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < row; i++) {
			String str = input(1);
			for (int j = 0; j < col; j++) {
				arr[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < row; i++) {
			int cnt = 0;
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == 'S') {
					cnt = 0;
					set.remove(i);
					break;
				}

				cnt++;
				set.add(i);
			}

			res += cnt;
		}
		for (int j = 0; j < col; j++) {
			int cnt = 0;
			for (int i = 0; i < row; i++) {
				if (arr[i][j] == 'S') {
					cnt = 0;
					break;
				}

				if (!set.contains(i)) {
					cnt++;
				}
			}

			res += cnt;
		}

		print(res);

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