import java.util.*;

public class watermelon {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		if (n != 2 && n % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
