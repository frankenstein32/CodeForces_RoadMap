import java.util.*;

public class MinimalSquare {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {
			int a = scn.nextInt();
			int b = scn.nextInt();

			int max = Math.max(a, b);
			int min = Math.min(a, b);

			int res = Math.max(max, 2 * min);
			System.out.println(res * res);
		}
	}
}