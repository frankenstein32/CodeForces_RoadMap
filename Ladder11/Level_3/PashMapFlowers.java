import java.util.*;

public class PashMapFlowers {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		long[] arr = new long[n];
		TakeInput(arr);

		long maxE = 0;
		long minE = Long.MAX_VALUE;

		for (long val : arr) {
			maxE = Math.max(maxE, val);
			minE = Math.min(minE, val);
		}

		if (maxE == minE) {
			print("0 " + ((long)n * (n - 1)) / 2);
			return;
		}

		long maxF = 0, minF = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == maxE)
				maxF++;
			if (arr[i] == minE)
				minF++;
		}

		print((maxE - minE) + " " + (maxF * minF));

	}

	public static long input() {
		return scn.nextLong();
	}

	public static String input(int... var) {
		return scn.next();
	}

	// public static void TakeInput(int[] arr) {
	// 	for (int i = 0; i < arr.length; i++)
	// 		arr[i] = (int)input();
	// }

	public static void TakeInput(long[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = input();
	}

	public static <T> void printArray(T[] arr) {
		for (T val : arr)
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