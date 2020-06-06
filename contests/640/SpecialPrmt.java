import java.util.*;

public class SpecialPrmt {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = (int)input();

		while (t-- > 0) {

			long n = input();

			if (n < 4) {
				print(-1, true);
				continue;
			}

			for (long i = n; i > 0; i--) {
				if ((i & 1) == 1) print(i + " ", false);
			}

			print("4 2 ", false);

			for (long i = 6; i <= n; i += 2)
				print(i + " ", false);

			print("", true);
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