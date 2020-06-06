import java.util.*;

public class BuyingShovels {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {
			long n = scn.nextLong();
			long k = scn.nextLong();

			if (n <= k) {
				System.out.println(1);
			} else {
				long min = Long.MAX_VALUE;

				for (int i = 1; i <= (long)Math.sqrt(n); i++) {

					if (i <= k && n % i == 0) {
						min = Math.min(min, n / i);

						if (n / i <= k) {
							min = Math.min(min, i);
						}
					}
				}

				System.out.println(min);
			}
		}
	}
}