import java.util.*;

public class TL {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		int m = (int)input();
		int[] correct = new int[n];
		int[] wrong = new int[m];
		TakeInput(correct);
		TakeInput(wrong);

		int min1 = Integer.MAX_VALUE, max1 = Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			min1 = Math.min(min1, correct[i]);
			max1 = Math.max(max1, correct[i]);
		}

		int tl = Math.max(2 * min1, max1);

		for (int i = 0; i < m; i++) {
			min2 = Math.min(min2, wrong[i]);
		}

		if (tl >= min2) {
			print(-1);
		} else {
			print(tl);
		}
	}


	public static long input() {
		return scn.nextLong();
	}

	public static String input(int... var) {
		return scn.next();
	}

	public static void TakeInput(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int)input();
	}

	public static void TakeInput(long[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = input();
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