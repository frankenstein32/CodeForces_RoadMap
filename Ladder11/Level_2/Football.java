import java.util.*;

public class Football {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int) input();
		HashMap<String, Integer> map = new HashMap<>();
		String winner = "";
		int cnt = 0;

		while (n-- > 0) {
			String inp = input(1);
			map.put(inp, map.getOrDefault(inp, 0) + 1);

			if (map.get(inp) > cnt) {
				cnt = map.get(inp);
				winner = inp;
			}
		}

		print(winner);
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