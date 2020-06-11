import java.util.*;

public class XeniaAndDiv {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		int n = (int)input();
		int[] arr = new int[n];
		TakeInput(arr);

		int[] cnt = new int[7];
		for (int a : arr) {
			if (a == 5 || a == 7) {
				print(-1);
				return ;
			}
			cnt[a]++;
		}

		if (cnt[2] >= cnt[4] && cnt[1] == cnt[4] + cnt[6] && cnt[2] + cnt[3] == cnt[6] + cnt[4]) {

			for (int i = 0; i < cnt[4]; i++)
				print("1 2 4\n");
			cnt[2] -= cnt[4];
			for (int i = 0; i < cnt[2]; i++)
				print("1 2 6\n");
			cnt[6] -= cnt[2];
			for (int i = 0; i < cnt[3]; i++)
				print("1 3 6\n");
		} else {
			print(-1);
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