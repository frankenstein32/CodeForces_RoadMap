import java.util.*;

public class KthBeautiful {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = (int)input();
		while (t-- > 0) {

			int n = (int)input();
			int k = (int)input();

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++)
				sb.append("a");

			for (int i = n - 2; i >= 0; i--) {
				if (k <= n - i - 1) {
					sb.setCharAt(i, 'b');
					sb.setCharAt(n - k, 'b');
					print(sb, "\n");
					break;
				}

				k -= (n - i - 1);
			}

		}

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