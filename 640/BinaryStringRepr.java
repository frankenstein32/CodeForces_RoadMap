import java.util.*;

public class BinaryStringRepr {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int t = (int)input();

		while (t-- > 0) {

			int n0 = (int)input();
			int n1 = (int)input();
			int n2 = (int)input();

			if (n1 == 0) {
				if (n0 != 0) {
					for (int i = 0; i <= n0; i++)
						print("0", false);
				} else {
					for (int i = 0; i <= n2; i++)
						print("1", false);
				}
				print("", true);
				continue;
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n1 + 1; i++) {
				if ((i & 1) == 1) sb.append("0");
				else sb.append("1");
			}

			for (int i = 0; i < n0; i++)
				sb.insert(1, "0");
			for (int i = 0; i < n2; i++)
				sb.insert(0, "1");

			print(sb.toString(), true);
		}


	}

	public static long input() {
		return scn.nextLong();
	}

	public static <T> void print(T t, boolean ln) {
		System.out.print(t);
		if (ln) System.out.println();
	}
}