import java.util.*;
import java.io.*;

public class VasilyBearAndTriangle {

	public static void main(String[] args) {


		helper();
	}

	public static void helper() {

		int x = (int)input();
		int y = (int)input();
		int sx = x >= 0 ? 1 : -1;
		int sy = y >= 0 ? 1 : -1;
		int sum = Math.abs(x) + Math.abs(y);
		int[] p1 = new int[] {sx * sum, 0};
		int[] p2 = new int[] {0, sy * sum};

		if (p1[0] > p2[0]) {
			int[] temp = p1;
			p1 = p2;
			p2 = temp;
		}

		print(p1[0] + " " + p1[1] + " " + p2[0] + " " + p2[1]);
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