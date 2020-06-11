import java.util.*;

public class KitaharaGift {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		if (n == 1) {
			print("NO");
			return;
		}
		int cnt100 = 0;
		int cnt200 = 0;
		for (int i = 0; i < n; i++) {
			int val = (int)input();
			if (val == 100) {
				cnt100++;
			} else {
				cnt200++;
			}
		}

		if (cnt200 % 2 != 0) {
			cnt100 -= 2;
		}

		print(cnt100 >= 0 && cnt100 % 2 == 0 ? "YES" : "NO");
	}

	public static int[] Freq(String s) {
		int[] freq = new int[256];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') continue;
			freq[s.charAt(i)]++;
		}
		return freq;
	}

	public static long input() {
		return scn.nextLong();
	}

	public static String input(int... var) {
		return scn.nextLine();
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