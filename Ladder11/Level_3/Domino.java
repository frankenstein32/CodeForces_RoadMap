import java.util.*;

public class Domino {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		int[][] arr = new int[n][2];
		int s1 = 0, s2 = 0;
		for (int i = 0; i < n; i++) {
			arr[i][0] = (int)input();
			arr[i][1] = (int)input();
			s1 += arr[i][0];
			s2 += arr[i][1];
		}

		if ((s1 & 1) == 0 && (s2 & 1) == 0) {
			print(0);
			return;
		}

		if ((s1 & 1) == 1 && (s2 & 1) == 1) {

			for (int i = 0; i < n; i++) {
				if (((arr[i][0] & 1) ^ (arr[i][1] & 1)) == 1) {
					print(1);
					return;
				}
			}
		}

		print(-1);

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

	public static void TakeInput(long[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = input();
	}

	public static void printArray(int[] arr) {
		for (int val : arr)
			print(val + " ");

		print("\n");
	}

	public static void printArray(long[] arr) {
		for (long val : arr)
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