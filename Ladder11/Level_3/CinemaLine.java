import java.util.Scanner;

public class CinemaLine {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		int[] arr = new int[n];
		TakeInput(arr);

		int cnt25 = 0, cnt50 = 0, cnt100 = 0;
		for (int a : arr) {

			if (a == 25) {
				cnt25++;
			} else if (a == 50) {
				cnt50++;
				cnt25--;
			} else {
				if (cnt50 > 0) {
					cnt50--;
				} else {
					cnt25 -= 2;
				}

				cnt25--;
				cnt100++;
			}

			if (cnt25 < 0) {
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