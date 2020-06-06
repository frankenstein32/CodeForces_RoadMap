import java.util.*;

public class KthNoDiv {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = (int)input();

		while (t-- > 0) {

			long n = input();
			long k = input();

			print((int)Math.floor((k - 1) / (n - 1)) + k, true);

		}
	}

	public static long input() {
		return scn.nextLong();
	}

	public static <T> void print(T t, boolean ln) {
		System.out.print(t);
		if (ln) System.out.println();
	}
}