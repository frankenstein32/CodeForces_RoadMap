import java.util.*;

public class SimilarPairs {

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


			if (helper(arr, 0, 0, 0)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static boolean helper(int[] arr, int vidx, int even, int odd) {

		if (vidx >= arr.length ) {
			return odd % 2 == 0 && even % 2 == 0;
		}

		boolean inc = false, exc = false;
		if (vidx < arr.length - 1 && Math.abs(arr[vidx] - arr[vidx + 1]) == 1) {
			inc = helper(arr, vidx + 2, even, odd);
		}

		if (arr[vidx] % 2 == 0) {
			exc = helper(arr, vidx + 1, even + 1, odd);
		} else {
			exc = helper(arr, vidx + 1, even, odd + 1);
		}

		return inc || exc;

	}
}