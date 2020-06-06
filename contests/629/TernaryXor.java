import java.util.*;

public class TernaryXor {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = (int)input();
		while (t-- > 0) {

			int n = (int)input();
			String str = scn.next();

			StringBuilder a = new StringBuilder("1");
			StringBuilder b = new StringBuilder("1");

			boolean first = true;
			for (int i = 1; i < n; i++) {

				if (str.charAt(i) == '0') {
					a.append("0");
					b.append("0");
				} else if (str.charAt(i) == '2') {

					if (first) {
						a.append("1");
						b.append("1");
					} else {
						a.append("0");
						b.append("2");
					}

				} else {

					if (first) {
						a.append("1");
						b.append("0");
					} else {
						a.append("0");
						b.append("1");
					}

					first = false;
				}
			}

			print(a, "\n");
			print(b, "\n");
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