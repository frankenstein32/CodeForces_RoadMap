import java.util.*;

public class YaroSlavePrmt {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int)input();
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		int threshold = (int)Math.ceil(n / 2.0);
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {

			if (e.getValue() > threshold) {
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