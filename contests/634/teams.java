import java.util.*;

public class teams {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			int n = scn.nextInt();
			int[] arr = new int[n + 1];
			for (int i = 0; i < n; i++)
				arr[scn.nextInt()]++;

			int nd = 0, d = 0;
			for (int i = 1; i <= n; i++) {
				d += arr[i] == 1 ? 1 : 0;
				nd = Math.max(nd, arr[i]);
			}

			if (nd > d) {
				System.out.println(d + 1 <= nd - 1 ? d + 1 : d);
			} else (nd < d) {
				System.out.println(nd + 1 <= d  - 1 ? nd + 1 : nd);
			} else {
				System.out.println(d + nd <= n ? nd : );
			}
		}
	}
}
