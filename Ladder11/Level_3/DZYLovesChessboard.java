import java.util.*;

public class DZYLovesChessboard {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int m = (int)input();

		for (int i = 0; i < n; i++) {
			String temp = input(1);
			for (int j = 0; j < m; j++) {
				char ch = temp.charAt(j);
				if (ch != '.') {
					print(ch);
					continue;
				}
				if (((i + j) & 1) == 0)
					print("W");
				else
					print("B");
			}
			print();
		}

	}

	public static boolean isSafe(char[][] arr, int cr, int cc, char c) {
		return (cr == 0 || arr[cr - 1][cc] != c) && (cc == 0 || arr[cr][cc - 1] != c);
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