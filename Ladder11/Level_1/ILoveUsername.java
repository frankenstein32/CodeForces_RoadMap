import java.util.*;

public class ILoveUsername {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = (int)input();

		int min = arr[0];
		int max = arr[0];

		int res = 0;
		for (int i = 1; i < n; i++) {

			if (arr[i] < min) {
				min = arr[i];
				res++;
			}

			if (arr[i] > max) {
				max = arr[i];
				res++;
			}
		}

		print(res, "\n");
	}

	public static long input() {
		return scn.nextLong();
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