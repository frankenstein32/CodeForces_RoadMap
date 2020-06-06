import java.util.Scanner;

public class PetyaAndStrings {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();

	}

	public static void helper() {

		int n = (int)input();

		int res = 0;
		while (n-- > 0) {
			if (input() + input() + input() >= 2) {
				res++;
			}
		}

		print(res, "");
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