import java.util.*;

public class sumOfRound {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			long n = scn.nextLong();
			long mult = 1;
			List<Long> res = new ArrayList<>();
			while (n != 0) {

				long rem = n % 10;
				if (rem != 0)
					res.add(rem * mult);
				mult *= 10;
				n /= 10;
			}
			System.out.println(res.size());
			for (long val : res) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
}
