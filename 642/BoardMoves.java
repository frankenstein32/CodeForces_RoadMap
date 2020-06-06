import java.util.*;

public class BoardMoves {


	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			long n = scn.nextInt();
			long ans = 0;
			for (int i = 1; i <= n / 2; i++) {
				ans += i * 1l * i;
			}

			print(ans * 8, true);
		}

	}

	public static <T> void print(T t, boolean ln) {

		System.out.print(t);
		if (ln) System.out.println();

	}

}