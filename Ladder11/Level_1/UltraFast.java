import java.util.*;

public class UltraFast {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();

	}

	public static void helper() {

		String one = scn.next();
		String two = scn.next();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < one.length(); i++) {
			if (one.charAt(i) == two.charAt(i)) {
				sb.append("0");
			} else {
				sb.append("1");
			}
		}

		print(sb, "\n");
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