import java.util.*;

public class EffectiveApproach {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int[] arr = new int[n];
		int[] res = new int[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = (int)input();
			res[arr[i]] = i + 1;
		}
		int m = (int)input();
		int one = 0, two = 0;
		for (int i = 0; i < m; i++) {

			int q = (int)input();
			one += res[q];
			two += n - res[q] + 1;
		}

		print(one + " " + two, "\n");

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