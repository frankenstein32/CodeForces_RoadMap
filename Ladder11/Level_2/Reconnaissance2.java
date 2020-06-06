import java.util.*;

public class Reconnaissance2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int[] arr = new int[n];
		TakeInput(arr);

		int min = Integer.MAX_VALUE;
		int a = -1, b = -1;
		for (int i = 0; i < n; i++) {
			if (min > Math.abs(arr[i] - arr[(i + 1) % n])) {
				min = Math.abs(arr[i] - arr[(i + 1) % n]);
				a = i;
				b = (i + 1);
			}
		}

		print((a + 1) + " " + (((b) % n) + 1), "\n");
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