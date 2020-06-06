import java.util.*;

public class BeautifulMatix {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();

	}

	public static void helper() {

		int n = 5;
		int[][] v = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				v[i][j] = (int)input();
		}
		int r = 0, c = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (v[i][j] == 1) {
					r = i;
					c = j;
					break;
				}
			}
		}

		print(Math.abs(r - 2) + Math.abs(c - 2), "\n");
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