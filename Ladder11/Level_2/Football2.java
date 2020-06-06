import java.util.*;

public class Football2 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		String str = input(1);
		int one = 0, zero = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '1') {
				one++;
				zero = 0;
			} else {
				one = 0;
				zero++;
			}

			if (one == 7 || zero == 7) {
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