import java.util.*;

public class tooLong {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();
		while (t-- > 0) {

			String s = scn.next();
			if (s.length() <= 10) {
				System.out.println(s);
			} else {
				System.out.println(s.charAt(0) + "" + (s.length() - 2) + s.charAt(s.length() - 1));
			}
		}
	}
}
