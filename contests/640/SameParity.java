import java.util.*;

public class SameParity {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = (int)input();

		while (t-- > 0) {

			long n = input();
			int k = (int)input();

			long n1 = n - (k - 1);
			if (n1 > 0 && n1 % 2 == 1) {
				print("YES", true);
				for (int i = 0; i < k - 1; i++)
					print("1 ", false);
				print(n1, true);
				continue;
			}

			long n2 = n - 2 * (k - 1);
			if (n2 > 0 && n2 % 2 == 0) {
				print("YES", true);
				for (int i = 0; i < k - 1; i++)
					print("2 ", false);
				print(n2, true);
				continue;

			}

			print("NO", true);
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