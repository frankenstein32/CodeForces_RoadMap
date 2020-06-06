import java.util.*;

public class AlternateSubseq {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			int n = scn.nextInt();
			long[] arr = new long[n];

			for (int i = 0; i < n; i++)
				arr[i] = scn.nextLong();

			int i = 0, j = 0;
			long sum = 0;
			while (j < n) {

				if ((arr[i] < 0 && arr[j] > 0) || (arr[i] > 0 && arr[j] < 0)) {
					sum += arr[i];
					i = j;
				} else if (arr[i] < arr[j]) {
					i = j;
				}

				j++;
			}

			System.out.println(sum + arr[i]);
		}
	}
}
