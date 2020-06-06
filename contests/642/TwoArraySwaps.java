import java.util.*;

public class TwoArraySwaps {


	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {
			int n = scn.nextInt();
			int k = scn.nextInt();

			int[] one = new int[n];
			int[] two = new int[n];

			for (int i = 0; i < n; i++)
				one[i] = scn.nextInt();

			for (int i = 0; i < n; i++)
				two[i] = scn.nextInt();

			Arrays.sort(one);
			Arrays.sort(two);

			int i = 0, sum = 0;
			while (i < n) {

				if (k-- > 0) {
					sum += Math.max(one[i], two[n - i - 1]);
				} else {
					sum += one[i];
				}

				i++;
			}

			print(sum, true);
		}


	}

	public static <T> void print(T t, boolean ln) {

		System.out.print(t);
		if (ln) System.out.println();

	}

}