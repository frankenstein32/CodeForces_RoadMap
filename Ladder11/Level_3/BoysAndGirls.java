import java.util.*;
import java.io.*;

public class BoysAndGirls {

	public static void main(String[] args) throws IOException {

		helper();
	}

	public static void helper() throws IOException {
		FileReader reader = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(reader);
		FileWriter out = new FileWriter("output.txt");

		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int min = Math.min(n , m);
		int max = Math.max(n, m);

		for (int i = 0; i < min; i++) {

			if (max == n) {
				print("BG");
				out.write("BG");
			} else {
				print("GB");
				out.write("GB");
			}
		}

		for (int i = 0; i < max - min; i++) {
			if (max == n) {
				print("B");
				out.write("B");
			} else {
				print("G");
				out.write("G");
			}
		}
		br.close();
		out.close();

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