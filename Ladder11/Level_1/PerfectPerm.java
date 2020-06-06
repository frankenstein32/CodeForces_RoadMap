import java.util.*;

public class PerfectPerm {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		if (n % 2 == 1) {
			print(-1, "\n");
			return;
		}

		int cnt = 2;
		for (int i = 1; i <= n / 2; i++) {

			print(cnt, " ");
			print(cnt - 1, " ");

			cnt += 2;
		}

		print("", "\n");
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