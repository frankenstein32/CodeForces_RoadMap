import java.util.*;

public class EvenOdds {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		long n = input();
		long k = input();

		if (n == 1) {
			print(1, "\n");
			return;
		}
		long mid = (long)Math.ceil(n / 2.0);

		if (k <= mid) {
			print(1 + (k - 1) * 2, "\n");
		} else {
			print(2 + (k - mid - 1) * 2, "\n");
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

	public static <T> void printArray(T[] arr) {
		for (T val : arr)
			print(val, " ");

		print(" ", "\n");
	}

	public static <T> void print(T t, String sep) {
		System.out.print(t + sep);
	}
}