import java.util.*;

public class SystemOfEquations {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int) input();
		int m = (int) input();

		int cnt = 0;
		for (int a = 0; a <= n; a++) {
			for (int b = 0; b <= m; b++) {
				if (a * a + b == n && a + b * b == m) {
					cnt++;
				}
			}
		}

		print(cnt);

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