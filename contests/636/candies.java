import java.util.*;

public class candies {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			long n = scn.nextLong();
			for (int i = 2; i <= 30; i++) {
				long div = (1 << i) - 1;
				if (n % div == 0) {
					System.out.println(n / div);
					break;
				}
			}
		}
	}
}
