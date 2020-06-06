import java.util.*;

public class DimaFriends {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += (int)input();

		int[] strg = new int[5 * (n + 1) + 1];
		for (int i = 1; i < strg.length; i += n + 1) {
			strg[i] = 1;
		}

		int cnt = 0;
		for (int i = 1; i <= 5; i++) {
			if (strg[sum + i] == 1) continue;
			cnt++;
		}
		print(cnt, "\n");
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