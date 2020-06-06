import java.util.*;

public class TheNumberOfPositions {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int k = (int) input();
		String str = input(1);

		if (k == 1) {
			print(str);
			return;
		}

		int[] freq = new int[26];
		for (char ch : str.toCharArray()) {
			freq[ch - 'a']++;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			if (freq[i] == 0) {
				continue;
			}

			if (freq[i] % k != 0) {
				print(-1);
				return;
			}

			for (int j = 0; j < freq[i] / k; j++)
				sb.append((char)(i + 'a'));
		}

		StringBuilder res = new StringBuilder();
		for (int i = 0; i < k; i++)
			res.append(sb);

		print(res + "\n");

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