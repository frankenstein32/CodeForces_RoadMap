import java.util.*;

public class AntiSudoku {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			for (int i = 0; i < 9; i++) {
				StringBuilder sb = new StringBuilder(scn.next());
				int f = sb.charAt(i) - '0';
				if (f == 9) {
					f = 1;
				} else {
					f++;
				}
				sb.setCharAt(i, (char)(f + '0'));
				System.out.println(sb);
			}
		}
	}
}
