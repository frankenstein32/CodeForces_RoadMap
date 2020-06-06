import java.util.*;

public class PresentFromLena {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int rows = 1;
		int nst = 1;
		int nsp = n;

		while (rows <= 2 * n + 1) {

			for (int csp = 1; csp <= nsp; csp++) {
				print("  ");
			}

			int val = 0;
			for (int cst = 1; cst <= nst; cst++) {
				print(val);
				if (cst != nst) {
					print(" ");
				}

				if (cst <= nst / 2) {
					val++;
				} else {
					val--;
				}
			}

			print();

			if (rows <= n) {
				nst += 2;
				nsp--;
			} else {
				nst -= 2;
				nsp++;
			}

			rows++;
		}
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