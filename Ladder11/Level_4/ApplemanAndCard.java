import java.util.*;
import java.io.*;

public class ApplemanAndCard {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		long k = input();
		long[] freq = new long[26];
		String str = input(1);

		for (char ch : str.toCharArray()) {
			freq[ch - 'A']++;
		}

		Arrays.sort(freq);
		long res = 0;
		for (int i = 25; i >= 0; i--) {
			if (freq[i] == 0)
				break;
			if (freq[i] <= k) {

				res += (freq[i] * freq[i]);
				k -= freq[i];
			} else {
				res += (k * k);
				break;
			}

			if (k == 0) {
				break;
			}
		}

		println(res);

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