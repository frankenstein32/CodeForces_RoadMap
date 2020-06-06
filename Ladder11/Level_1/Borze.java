import java.util.*;

public class Borze {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();

	}

	public static void helper() {

		String str = scn.next();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '.') {
				print(0, "");
			} else {

				if (str.charAt(i + 1) == '.') {
					print(1, "");
				} else {
					print(2, "");
				}

				i++;
			}
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