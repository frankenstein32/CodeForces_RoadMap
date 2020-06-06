import java.util.*;

public class NextRound {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		Arrays.sort(arr);
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0 && arr[i] >= arr[n - k]) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
