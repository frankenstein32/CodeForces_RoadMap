import java.util.*;

public class MostUnstableArray {


	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			long n = scn.nextInt();
			long m = scn.nextInt();

			if (n == 1) {
				print(0, true);
			} else if (n == 2) {
				print(m, true);
			} else {
				print(2 * m, true);
			}

		}

	}

	public static <T> void print(T t, boolean ln) {

		System.out.print(t);
		if (ln) System.out.println();

	}

}