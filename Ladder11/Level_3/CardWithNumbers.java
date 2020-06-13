import java.util.*;
import java.io.*;

public class CardWithNumbers {

	public static void main(String[] args) throws IOException {

		helper();
	}

	public static void helper() throws IOException {

		FileReader reader = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(reader);
		FileWriter out = new FileWriter("output.txt");
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		String[] input = br.readLine().split("\\s+");
		int i = 1;
		for (String inp : input) {
			map.computeIfAbsent(Integer.parseInt(inp), k -> new ArrayList<>()).add(i);
			i++;
		}
		for (int key : map.keySet()) {
			if (map.get(key).size() % 2 != 0) {
				out.write("-1");
				out.close();
				return;
			}
		}

		for (int key : map.keySet()) {
			for (i = 0; i < map.get(key).size() - 1; i += 2) {
				out.write(map.get(key).get(i) + " " + map.get(key).get(i + 1));
				out.write("\n");
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