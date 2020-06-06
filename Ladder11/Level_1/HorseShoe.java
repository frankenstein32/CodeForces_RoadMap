import java.util.*;

public class HorseShoe {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		helper();
	}

	public static void helper() {

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 4; i++)
			set.add((int)input());

		print(4 - set.size(), "\n");
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