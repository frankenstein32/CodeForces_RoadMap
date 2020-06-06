import java.util.*;

public class Cupboards {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int temp = n;
		int openL = 0, openR = 0;
		while (temp-- > 0) {
			if ((int)input() == 0) openL++;
			if ((int)input() == 0) openR++;
		}
		print(Math.min(openL, n - openL) + Math.min(openR, n - openR), "\n");

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