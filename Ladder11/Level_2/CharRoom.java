import java.util.*;

public class CharRoom {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		String inp = input(1);
		String match = "hello";

		int i = 0, j = 0;

		while (i < inp.length()) {

			if (inp.charAt(i) == match.charAt(j)) {
				j++;
			}
			i++;

			if (j == match.length()) {
				print("YES");
				return;
			}
		}

		print("NO");

	}

	public static long input() {
		return scn.nextLong();
	}

	public static String input(int... var) {
		return scn.next();
	}

	public static void TakeInput(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int)input();
	}

	public static <T> void printArray(T[] arr) {
		for (T val : arr)
			print(val + " ");

		print("\n");
	}

	public static <T> void print(T t) {
		System.out.print(t);
	}
	public static void print() {
		System.out.println();
	}
}