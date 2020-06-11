import java.util.*;

public class ShooshunsAndSequence {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int k = (int)input();

		int[] arr = new int[n];
		TakeInput(arr);

		int val = 0;
		int cont = 0;
		for (int i = 0; i < n; i++) {

			if (arr[i] == val) {
				cont++;
			} else {
				cont = 1;
			}

			val = arr[i];
		}

		print(cont + k > n ? n - cont : -1);
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