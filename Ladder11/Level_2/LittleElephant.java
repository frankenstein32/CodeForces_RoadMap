import java.util.*;

public class LittleElephant {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int min = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int)input();
			if (arr[min] > arr[i]) {
				min = i;
			}
		}

		boolean found = false;
		for (int i = 0; i < n; i++) {

			if (arr[min] == arr[i]) {
				if (!found) {
					found = true;
				} else {
					print("Still Rozdil", "\n");
					return;
				}
			}
		}

		print(min + 1, "\n");
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