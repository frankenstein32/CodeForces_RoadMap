import java.util.*;

public class Tram {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();

		int maxP = 0;
		int p = 0;
		while (n-- > 0) {

			p -= (int)input();
			p += (int)input();
			maxP = Math.max(maxP, p);
		}

		print(maxP, "\n");
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