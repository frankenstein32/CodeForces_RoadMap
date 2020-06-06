import java.util.*;

public class candies {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			long n = scn.nextLong();
			if (n % 2 == 0) {
				System.out.println((n / 2) - 1);
			} else {
				System.out.println(n / 2);
			}
		}

	}
}
