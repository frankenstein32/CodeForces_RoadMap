import java.util.Scanner;

public class BoyorGirl {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();

	}

	public static void helper() {

		String src = scn.next() + scn.next();
		String pile = scn.next();
		int[] freq = new int[26];

		for (char ch : src.toCharArray())
			freq[ch - 'A']++;

		for (char ch : pile.toCharArray())
			freq[ch - 'A']--;

		for (int i = 0; i < 26; i++)
			if (freq[i] != 0) {
				print("NO", "\n");
				return;
			}

		print("YES", "\n");


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