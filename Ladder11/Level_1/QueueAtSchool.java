import java.util.*;

public class QueueAtSchool {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();

	}

	public static void helper() {

		int n = (int)input();
		int t = (int)input();

		StringBuilder sb = new StringBuilder(scn.next());

		while (t-- > 0) {

			for (int i = 0; i < n - 1;) {

				if (sb.charAt(i) == 'B' && sb.charAt(i + 1) == 'G') {
					sb.setCharAt(i, 'G');
					sb.setCharAt(i + 1, 'B');
					i += 2;
				} else
					i++;
			}
		}

		print(sb, "\n");
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