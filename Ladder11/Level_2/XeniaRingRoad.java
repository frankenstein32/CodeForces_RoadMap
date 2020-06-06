import java.util.*;

public class XeniaRingRoad {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int m = (int)input();

		long[] arr = new long[m];
		for (int i = 0; i < m; i++)
			arr[i] = input();

		long res = arr[0] - 1;
		for (int i = 1; i < m; i++) {

			if (arr[i - 1] > arr[i]) {
				res += n - arr[i - 1] + arr[i];
			} else if (arr[i - 1] < arr[i]) {
				res += arr[i] - arr[i - 1];
			}
		}

		print(res);

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