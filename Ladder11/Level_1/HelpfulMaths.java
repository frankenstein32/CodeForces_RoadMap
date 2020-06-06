import java.util.*;

public class HelpfulMaths {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		String str = scn.next();
		String[] arr = str.split("\\+");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			print(arr[i], "");
			if (i != arr.length - 1)
				print("+", "");
		}

		print("", "\n");

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