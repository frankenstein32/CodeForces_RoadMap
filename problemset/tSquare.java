import java.util.*;

public class tSquare {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		double n = scn.nextDouble();
		double m = scn.nextDouble();

		double a = scn.nextDouble();

		System.out.println((long)(Math.ceil(n / a) * (long)Math.ceil(m / a)));
	}
}
