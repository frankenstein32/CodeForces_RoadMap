import java.util.Scanner;

public class SoftDrinks {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();

	}

	public static void helper() {

		int n = (int)input();
		int k = (int)input();
		int l = (int)input();
		int limes = (int)input();
		int slices = (int)input();
		int salt = (int)input();
		int nl = (int)input();
		int nsalt = (int)input();

		int avToast = (k * l / nl);
		int avLimes = limes * slices;
		int avSalt = salt / nsalt;

		print(Math.min(Math.min(avToast, avLimes), avSalt) / n, "\n");

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