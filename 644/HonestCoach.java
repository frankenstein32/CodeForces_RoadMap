import java.util.*;

public class HonestCoach {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}

			Arrays.sort(arr);
			int min = Integer.MAX_VALUE;
			for (int i = 1; i < n; i++) {
				min = Math.min(min, arr[i] - arr[i - 1]);
			}

			System.out.println(min);
		}
	}
}