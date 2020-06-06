import java.util.*;

public class Carousel {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int q = (int)input();
		while (q-- > 0) {
			helper();
		}
	}

	public static void helper() {

		int n = (int)input();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = (int)input();

		if (AllSame(arr, arr[0])) {
			print(1, "\n");

			for (int i = 0; i < n; i++)
				print(1, " ");
		} else if (n % 2 == 0) {
			print(2, "\n");
			for (int i = 0; i < n; i++)
				print(i % 2 + 1, " ");
		} else {

			for (int i = 0; i < n; i++) {
				if (arr[i] == arr[(i + 1) % n]) {

					print(2, "\n");
					int[] res = new int[n];
					for (int j = 0, pos = i + 1; pos < n; pos++, j ^= 1) {
						res[pos] = j + 1;
					}

					for (int j = 0, pos = i; pos >= 0; pos--, j ^= 1) {
						res[pos] = j + 1;
					}

					printArray(res);
					return;
				}
			}

			print(3, "\n");
			for (int i = 0; i < n - 1; i++)
				print(i % 2 + 1, " ");
			print(3, "");

		}

		print("", "\n");

	}

	public static boolean AllSame(int[] arr, int val) {

		for (int a : arr)
			if (a != val)
				return false;

		return true;
	}

	public static long input() {
		return scn.nextLong();
	}

	public static String input(int val) {
		return scn.next();
	}

	public static  void printArray(int[] arr) {
		for (int val : arr)
			print(val, " ");

		print(" ", "\n");
	}

	public static <T> void print(T t, String sep) {
		System.out.print(t + sep);
	}
}