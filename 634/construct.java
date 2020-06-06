import java.util.*;

public class construct {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			int n = scn.nextInt();
			int a = scn.nextInt();
			int b = scn.nextInt();

			StringBuilder sb = new StringBuilder();
			Queue<Character> q = new LinkedList<>();
			for (int i = 0; i < b; i++) {
				sb.append((char)('a' + i));
				q.add((char)('a' + i));
			}

			for (int i = 0; i < a - b; i++) {
				char val = q.remove();
				sb.append(val);
				q.add(val);
			}

			for (int i = a; i < n; i++) {
				sb.append(sb.charAt(i - a));
			}

			System.out.println(sb);
		}
	}
}
