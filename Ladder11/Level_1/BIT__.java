import java.util.Scanner;

public class BIT__ {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();

	}

	public static void helper() {

		int n = (int)input();

		int x = 0;
		while (n-- > 0) {
			String inp = scn.next();
			x += inp.charAt(1) == '-' ? -1 : 1;
		}

		print(x, "");
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