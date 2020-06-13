import java.util.*;

public class EasyNumberChallenge {
	static int[] divs = new int[1_000_001];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		helper();
	}

	public static void helper() {

		// int[] divs = new int[1_000_001];
		long m =  1073741824L;
		// for (int i = 1; i < divs.length; i++)
		// 	divs[i] = div(i);

		int a = (int)input();
		int b = (int)input();
		int c = (int)input();

		long sum = 0;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				for (int k = 1; k <= c; k++) {
					sum = (sum + div(i * j * k)) % m;
				}
			}
		}

		print(sum);

	}

	public static int div(int num) {

		if (divs[num] != 0) {
			return divs[num];
		}

		int cnt = 0;
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				if (i != num / i) {
					cnt ++;
				}
				cnt++;
			}
		}
		return divs[num] = cnt;
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