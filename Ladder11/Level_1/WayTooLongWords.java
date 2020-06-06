import java.util.Scanner;

public class WayTooLongWords {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = (int)input();
		while (t-- > 0) {
			helper();
		}

	}

	public static void helper() {

		String str = scn.next();
		if (str.length() <= 10)
			print(str, "\n");
		else {
			print(str.charAt(0) + "" + (str.length() - 2) + str.charAt(str.length() - 1), "\n");
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