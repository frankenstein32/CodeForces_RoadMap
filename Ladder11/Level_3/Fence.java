import java.util.*;

public class Fence {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		int k = (int)input();
		int[] arr = new int[n];
		TakeInput(arr);

		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}

		int si = 0;
		int min_sum = sum;
		for (int i = k; i < n; i++) {
			sum += arr[i] - arr[i - k];
			if (sum < min_sum) {
				min_sum = sum;
				si = i - k + 1;
			}
		}

		print(si + 1);
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