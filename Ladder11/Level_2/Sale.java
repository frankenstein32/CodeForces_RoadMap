import java.util.*;

public class Sale {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int) input();
		int k = (int) input();

		int[] arr = new int[n];
		TakeInput(arr);

		Arrays.sort(arr);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] >= 0) break;
			sum += -arr[i];
			k--;

			if (k == 0) {
				break;
			}
		}

		print(sum);

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