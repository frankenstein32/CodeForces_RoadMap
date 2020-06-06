import java.util.*;

public class SuperCentralPoint {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = (int)input();
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = (int)input();
			arr[i][1] = (int)input();
		}

		int res = 0;

		for (int i = 0; i < n; i++) {
			int[] p1 = arr[i];
			boolean l, r, u, d;
			l = r = u = d = false;
			for (int j = 0; j < n; j++) {
				int[] p2 = arr[j];

				if (p1[0] == p2[0] && p1[1] == p2[1]) {
					continue;
				}

				if (p1[0] != p2[0] && p1[1] != p2[1]) {
					continue;
				}

				if (p1[0] == p2[0]) {
					if (p1[1] > p2[1]) {
						d = true;
					} else {
						u = true;
					}
				} else {
					if (p1[0] > p2[0]) {
						l = true;
					} else {
						r = true;
					}
				}
			}

			if (l && r && u && d) res++;
		}

		print(res, "\n");
	}

	public static long input() {
		return scn.nextLong();
	}

	public static <T> void printArray(T[] arr) {
		for (T val : arr)
			print(val, " ");

		print(" ", "\n");
	}

	public static <T> void print(T t, String sep) {
		System.out.print(t + sep);
	}
}