import java.util.*;
import java.io.*;

public class LifeWithoutZeros {

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		String az = input(1);
		String bz = input(1);
		String awz = removeZeros(az);
		String bwz = removeZeros(bz);

		String ansz = String.valueOf(Long.parseLong(az) + Long.parseLong(bz));
		String answz = String.valueOf(Long.parseLong(awz) + Long.parseLong(bwz));

		if (removeZeros(ansz).equals(answz)) {
			print("YES");
		} else {
			print("NO");
		}
	}

	public static String removeZeros(String str) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++)
			sb.append(str.charAt(i) == '0' ? "" : str.charAt(i));

		return sb.toString();
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