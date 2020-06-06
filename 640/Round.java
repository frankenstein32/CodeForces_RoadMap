import java.util.*;

public class Round {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = (int)input();
		while (t-- > 0) {

			long n = input();

			long mult = 1;
			ArrayList<Long> res = new ArrayList<>();
			while (n > 0) {

				long rem = n % 10;
				if (rem != 0)
					res.add(rem * mult);

				mult *= 10;
				n /= 10;
			}

			print(res.size(), true);
			for (long val : res)
				print(val + " ", false);

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