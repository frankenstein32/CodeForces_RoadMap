import java.util.*;

public class ComparingStrings {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		String s1 = input(1);
		String s2 = input(1);

		if (s1.length() != s2.length()) {
			print("NO");
			return;
		}

		Set<Character> one = new HashSet<>();
		Set<Character> two = new HashSet<>();
		int cnt = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				one.add(s1.charAt(i));
				two.add(s2.charAt(i));
				cnt++;

				if (cnt > 2) {
					print("NO");
					return;
				}
			}
		}


		for (char ch : one) {
			if (!two.contains(ch)) {
				print("NO");
				return;
			}
		}

		print("YES");


	}

	public static long input() {
		return scn.nextLong();
	}

	public static String input(int... var) {
		return scn.next();
	}

	public static void TakeInput(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int)input();
	}

	public static void TakeInput(long[] arr) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = input();
	}

	public static void printArray(int[] arr) {
		for (int val : arr)
			print(val + " ");

		print("\n");
	}

	public static void printArray(long[] arr) {
		for (long val : arr)
			print(val + " ");

		print("\n");
	}

	public static <T> void print(T t) {
		System.out.print(t);
	}
	public static void print() {
		System.out.println();
	}
}