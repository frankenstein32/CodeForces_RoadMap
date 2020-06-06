import java.util.*;

public class HexadecimalTheorem {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		long n = input();

		if (n == 0) {
			print("0 0 0");
			return;
		} else if (n == 2) {
			print("0 1 1");
			return;
		}
		long a = 0, b = 1, c = 0, d = 0;

		while (a + b < n) {
			long sum = a + b;
			d = c;
			c = a;
			a = b;
			b = sum;
		}

		print(d + " " + c + " " + b);

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
}