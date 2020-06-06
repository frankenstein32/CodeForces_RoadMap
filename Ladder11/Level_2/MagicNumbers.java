import java.util.*;

public class MagicNumbers {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		String str = input(1);
		int ones = 0, four = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '1') {
				ones++;
				four = 0;
			} else if (str.charAt(i) == '4') {
				if (ones < 1 || four == 2) {
					print("NO");
					return;
				}
				four++;
			} else {
				print("NO");
				return;
			}
		}

		print("YES");
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