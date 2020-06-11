import java.util.*;

public class Letter {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		String s1 = input(1);
		String s2 = input(1);

		int[] freq_1 = Freq(s1);
		int[] freq_2 = Freq(s2);

		for (int i = 0; i < 256; i++) {
			if (freq_2[i] > freq_1[i]) {
				print("NO");
				return;
			}
		}
		print("YES");
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