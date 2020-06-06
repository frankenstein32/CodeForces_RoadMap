import java.util.*;

public class ABMatrix {

	public static <T> void print(T val, boolean nl) {
		System.out.print(val);
		if (nl) System.out.println();
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		for (int tt = 0; tt < t; tt++) {

			int h = scn.nextInt();
			int w = scn.nextInt();
			int a = scn.nextInt();
			int b = scn.nextInt();

			if (h * a != w * b) {
				print("NO", true);
				continue;
			}

			int[][] arr = new int[h][w];
			int shift = 0;
			for (shift = 1; shift < w; shift++) {
				if (shift * h % w == 0) {
					break;
				}
			}

			for (int i = 0, dx = 0; i < h; i++, dx += shift) {
				for (int j = 0; j < a; j++) {
					arr[i][(j + dx) % w] = 1;
				}
			}

			print("YES", true);
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					print(arr[i][j], false);
				}
				print("", true);
			}

		}
	}
}