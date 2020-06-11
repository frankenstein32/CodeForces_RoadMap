import java.util.*;

public class LittleElephantBits {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		String binary = input(1);
		int idx = binary.length() - 1;

		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '0') {
				idx = i;
				break;
			}
		}

		print(binary.substring(0, idx) + binary.substring(idx + 1));

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

	public static void TakeInput(long[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = input();
	}

	public static void printArray(int[] arr) {
		for (int val : arr)
			print(val + " ");

		print("\n");
	}

	public static void printArray(long[] arr) {
		for (long val : arr)
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