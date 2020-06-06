import java.util.*;

public class balancedArray {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			int n = scn.nextInt();

			if ((n / 2) % 2 == 1) {
				System.out.println("NO");
			} else {
				System.out.println("Yes");

				int sume = 0;
				for (int i = 1; i <= n / 2; i++) {
					System.out.print(2 * i + " ");
					sume += (2 * i);
				}
				int sumo = 0;
				for (int i = 1, val = 1; i < n / 2; i++, val += 2) {
					System.out.print(val + " ");
					sumo += val;
				}

				System.out.println(sume - sumo);

			}

		}
	}
}
