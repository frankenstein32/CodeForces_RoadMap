import java.util.*;

public class DivProb {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = (int)input();
		while (t-- > 0) {

			long a = input();
			long b = input();

			if (a % b == 0) {
				print(0, "\n");
			} else {
				print(b - (a % b), "\n");
			}
		}

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