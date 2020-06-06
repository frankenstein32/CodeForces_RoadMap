import java.util.Scanner;

public class HQ9 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();

	}

	public static void helper() {

		String str = scn.next();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'H' || str.charAt(i) == 'Q' || str.charAt(i) == '9') {
				print("YES", "\n");
				return;
			}
		}

		print("NO", "\n");


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