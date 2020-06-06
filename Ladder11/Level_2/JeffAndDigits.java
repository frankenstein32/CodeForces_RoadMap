import java.util.*;

public class JeffAndDigits {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();

		int five = 0, zeros = 0;
		while (n-- > 0) {
			if (input() == 5) {
				five++;
			} else {
				zeros++;
			}
		}

		if (zeros < 1) {
			print(-1);
			return;
		}

		if (five < 9) {
			print(0);
			return;
		}

		int times = five / 9;
		for (int i = 0; i < 9 * times; i++)
			print(5);
		while (zeros-- > 0) {
			print(0);
		}

		print();

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