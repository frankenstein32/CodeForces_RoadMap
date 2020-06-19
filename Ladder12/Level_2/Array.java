import java.util.*;
import java.io.*;

public class Array {

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		List<Integer> neg = new ArrayList<>();
		List<Integer> pos = new ArrayList<>();
		int zero = 0;

		for (int i = 0; i < n; i++) {
			int val = (int)input();
			if (val < 0) {
				neg.add(val);
			} else if (val > 0) {
				pos.add(val);
			} else {
				zero++;
			}
		}


		println(1 + " " + neg.remove(neg.size() - 1));
		print((neg.size() - neg.size() % 2) + (pos.size()) + " ");
		for (int i = 0; i < neg.size() - neg.size() % 2; i++)
			print(neg.get(i) + " ");
		for (int i = 0; i < pos.size(); i++)
			print(pos.get(i) + " ");
		println("");
		print(zero + neg.size() % 2 + " ");
		if (neg.size() % 2 == 1) {
			print(neg.get(neg.size() - 1) + " ");
		}

		for (int i = 0; i < zero; i++) {
			print("0 ");
		}
		println("");

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