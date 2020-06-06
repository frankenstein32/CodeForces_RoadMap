import java.util.*;

public class LightsOut {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		int n = 3;
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (int)input();
			}
		}

		int[][] res = new int[n][n];

		int[][] dirs = {{ -1, 0}, {0, 0} , {0, 1},  {1, 0}, {0, -1}};
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 0) continue;
				for (int[] d : dirs) {
					if (valid(i + d[0], j + d[1])) {
						res[i + d[0]][j + d[1]] += arr[i][j];
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res[i][j] = res[i][j] % 2 == 0 ? 1 : 0;
				print(res[i][j], "");
			}
			print("", "\n");
		}
	}

	public static boolean valid(int x, int y) {

		return x >= 0 && x < 3 && y >= 0 && y < 3;
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