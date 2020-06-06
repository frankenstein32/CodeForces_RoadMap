import java.util.*;

public class StonesOnTable {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		String str = scn.next();

		int i = 0, j = 0;
		int res = 0;
		while (j < n) {

			if (str.charAt(i) != str.charAt(j)) {
				res += j - i - 1;
				i = j;
			}
			j++;
		}

		res += j - i - 1;
		print(res, "\n");
	}

	public static boolean valid(int x, int y) {

		return x >= 0 && x < 3 && y >= 0 && y < 3;
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