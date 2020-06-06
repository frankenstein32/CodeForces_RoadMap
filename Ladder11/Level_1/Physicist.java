import java.util.*;

public class Physicist {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = (int)input();
		helper(t);

	}

	public static void helper(int t) {

		int[][] v = new int[t][3];
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < 3; j++)
				v[i][j] = (int)input();
		}

		for (int j = 0; j < 3; j++) {
			int sum = 0;
			for (int i = 0; i < t; i++) {
				sum += v[i][j];
			}

			if (sum != 0) {
				print("NO", "\n");
				return;
			}
		}
		print("YES", "\n");
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