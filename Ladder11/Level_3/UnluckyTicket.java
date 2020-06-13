import java.util.*;

public class UnluckyTicket {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		String str = input(1);

		char[] f = new char[n];
		char[] s = new char[n];
		for (int i = 0; i < 2 * n; i++) {
			if (i < n) {
				f[i] = str.charAt(i);
			} else {
				s[i % n] = str.charAt(i);
			}
		}

		Arrays.sort(f);
		Arrays.sort(s);

		int i = 0, cnt = 0;
		while (i < n) {
			if (f[i] > s[i]) {
				cnt++;
			}

			i++;
		}

		if (cnt == n) {
			print("YES");
			return;
		}

		cnt = 0;
		i = 0;
		while (i < n) {
			if (f[i] < s[i]) {
				cnt++;
			}
			i++;
		}

		if (cnt == n) {
			print("YES");
		} else {
			print("NO");
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