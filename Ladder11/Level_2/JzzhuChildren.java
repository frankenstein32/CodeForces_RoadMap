import java.util.*;

public class JzzhuChildren {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int m = (int)input();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = (int)input();


		double max = Integer.MIN_VALUE;
		int idx = -1;

		for (int i = 0; i < n; i++) {

			if (max <=  Math.ceil((double)arr[i] / m)) {
				idx = i + 1;
				max = Math.ceil((double)arr[i] / m);
			}
		}

		print(idx, "\n");
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