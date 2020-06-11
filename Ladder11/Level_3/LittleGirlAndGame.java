import java.util.*;

public class LittleGirlAndGame {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		String str = input(1);
		int n = str.length();
		int[] freq = new int[26];
		for (int i = 0; i < n; i++)
			freq[str.charAt(i) - 'a']++;

		int turn = 1;
		while (n-- > 0) {

			if (isPal(freq)) {
				print(turn == 1 ? "First" : "Second");
				return;
			}

			int max_i = 0;
			for (int i = 0; i < 26; i++) {
				if (freq[max_i] < freq[i]) {
					max_i = i;
				}
			}
			freq[max_i]--;
			turn = turn == 1 ? 2 : 1;
		}

	}

	public static boolean isPal(int[] freq) {

		int odd = 0;
		for (int i = 0; i < 26; i++) {
			odd += freq[i] % 2;

			if (odd == 2) {
				return false;
			}
		}
		return true;
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