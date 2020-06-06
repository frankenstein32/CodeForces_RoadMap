import java.util.*;

public class StringTask {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		String str = input(1);
		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {

			if (!isVowel(ch)) {
				sb.append(".");

				if (Character.isUpperCase(ch)) {
					sb.append(Character.toLowerCase(ch));
				} else {
					sb.append(ch);
				}
			}
		}

		print(sb);

	}

	public static boolean isVowel(char ch) {

		return "AaEeIiOoUuyY".contains(ch + "");
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