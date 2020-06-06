import java.util.*;

public class Dragons {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int s = (int)input();
		int n = (int)input();

		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = scn.nextInt();
			arr[i][1] = scn.nextInt();
		}

		Arrays.sort(arr, (a, b) -> (a[0] - b[0]));

		for (int i = 0; i < n; i++) {

			if (s <= arr[i][0]) {
				print("NO");
				return;
			}

			s += arr[i][1];
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