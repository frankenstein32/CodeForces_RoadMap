import java.util.*;

public class BicycleChain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int) input();
		int[] a = new int[n];
		TakeInput(a);
		int m = (int) input();
		int[] b = new int[m];
		TakeInput(b);

		int max = 0;
		int res = 0;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {

				if (b[j] % a[i] == 0) {
					if (b[j] / a[i] > max) {
						max = b[j] / a[i];
						res = 1;
					} else if (b[j] / a[i] == max) {
						res++;
					}
				}
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