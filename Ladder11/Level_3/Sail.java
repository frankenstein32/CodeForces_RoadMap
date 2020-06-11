import java.util.*;

public class Sail {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		long x = input();
		long y = input();
		long X = input();
		long Y = input();

		String str = input(1);

		long east = 0, west = 0, north = 0, south = 0;
		if (x < X) {
			east = X - x;
		} else {
			west = x - X;
		}

		if (y < Y) {
			north = Y - y;
		} else {
			south = y - Y;
		}

		for (int i = 0; i < n; i++) {

			if (north != 0 && str.charAt(i) == 'N') {
				north--;
			} else if (south != 0 && str.charAt(i) == 'S') {
				south--;
			} else if (west != 0 && str.charAt(i) == 'W') {
				west--;
			} else if (east != 0 && str.charAt(i) == 'E') {
				east--;
			}

			if (east == 0 && west == 0 && north == 0 && south == 0) {
				print(i + 1);
				return;
			}

		}
		print(-1);

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