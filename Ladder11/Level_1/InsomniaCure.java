import java.util.*;

public class InsomniaCure {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int[] arr = new int[4];
		for (int i = 0; i < 4; i++)
			arr[i] = (int)input();

		int d = (int)input();

		boolean[] factors = new boolean[d + 1];

		for (int i = 0; i < 4; i++) {

			if (arr[i] <= d && factors[arr[i]]) {
				continue;
			}

			for (int mult = 1; mult * arr[i] <= d; mult++) {
				factors[mult * arr[i]] = true;
			}
		}

		int cnt = 0;
		for (int i = 1; i <= d; i++)
			cnt += factors[i] ? 1 : 0;

		print(cnt, "\n");

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