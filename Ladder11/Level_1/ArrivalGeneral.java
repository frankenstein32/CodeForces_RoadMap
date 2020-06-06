import java.util.*;

public class ArrivalGeneral {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = (int)input();

		int max = 0;
		int min = 0;

		for (int i = 0; i < n; i++) {
			max = arr[i] > arr[max] ? i : max;
			min = arr[i] <= arr[min] ? i : min;
		}

		if (max < min) {
			print(max + n - min - 1, "\n");
		} else {
			print(max + n - min - 2, "\n");
		}

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