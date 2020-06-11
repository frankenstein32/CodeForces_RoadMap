import java.util.*;

public class BigSegment {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		long[][] arr = new long[n][2];

		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i][0] = input();
			arr[i][1] = input();

			min = Math.min(min, arr[i][0]);
			max = Math.max(max, arr[i][1]);
		}

		for (int i = 0; i < n; i++) {
			if (arr[i][0] == min && arr[i][1] == max) {
				print(i + 1);
				return;
			}
		}

		print(-1);
		return;

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