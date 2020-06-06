import java.util.*;

public class Puzzles {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int m = (int)input();

		int[] arr = new int[m];
		TakeInput(arr);

		Arrays.sort(arr);
		int si = 0, ei = n - 1;
		int res = Integer.MAX_VALUE;
		while (ei < m) {
			if (res > arr[ei] - arr[si]) {
				res = arr[ei] - arr[si];
			}
			si++;
			ei++;
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