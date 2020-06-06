import java.util.*;

public class NearlyLuckyNumber {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		String str = scn.next();

		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '4' || str.charAt(i) == '7') {
				cnt++;
			}
		}

		print(cnt == 4 || cnt == 7 ? "YES" : "NO", "\n");
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