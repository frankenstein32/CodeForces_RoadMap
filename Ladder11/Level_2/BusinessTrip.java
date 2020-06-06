import java.util.*;

public class BusinessTrip {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int k = (int) input();

		if (k == 0) {
			print(0);
			return;
		}

		int[] arr = new int[12];
		TakeInput(arr);
		Arrays.sort(arr);
		int cnt = 0;
		for (int i = 11; i >= 0; i--) {
			k -= arr[i];
			cnt++;
			if (k <= 0) {
				print(cnt);
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