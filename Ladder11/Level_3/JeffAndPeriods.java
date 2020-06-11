import java.util.*;

public class JeffAndPeriods {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int[] arr = new int[n];
		TakeInput(arr);

		HashMap<Integer, int[]> map = new HashMap<>();
		for (int i = 0; i < n; i++) {

			if (map.containsKey(arr[i])) {

				int[] l = map.get(arr[i]);

				if (l[1] == 0) {
					map.put(arr[i], new int[] {i, i - l[0], 0});
				} else if (l[2] == 1 || i - l[0] != l[1]) {
					map.put(arr[i], new int[] {i, l[1], 1});
				} else {
					map.put(arr[i], new int[] {i, i  - l[0], 0});

				}
			} else {
				map.put(arr[i], new int[] { i, 0 , 0});
			}
		}

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		print(map.size() + "\n");
		Collections.sort(keys);

		for (int i = 0; i < keys.size(); i++) {
			if (map.get(keys.get(i))[2] != 1)
				print(keys.get(i) + " " + map.get(keys.get(i))[1] + "\n");
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