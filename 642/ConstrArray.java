import java.util.*;

public class ConstrArray {


	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t-- > 0) {

			int n = scn.nextInt();

			PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {

				@Override
				public int compare(int[] A, int[] B) {
					int da = dist(A);
					int db = dist(B);
					if (da == db) {
						return A[0] - B[0];
					}
					return db - da;
				}
			});

			pq.offer(new int[] {1, n});
			int[] res = new int[n];
			int i = 1;
			while (!pq.isEmpty()) {

				int[] rp = pq.poll();
				int mid = 0;
				if (dist(rp) % 2 == 0) {
					mid = (rp[1] + rp[0] - 1) / 2;
				} else {
					mid = (rp[1] + rp[0]) / 2;
				}

				res[mid - 1] = i++;
				if (mid - 1 >= rp[0])
					pq.offer(new int[] {rp[0], mid - 1});
				if (mid + 1 <= rp[1])
					pq.offer(new int[] {mid + 1, rp[1]});
			}

			for (int val : res)
				print(val + " ", false);

			print("", true);
		}

	}

	public static int dist(int[] A) {
		return A[1] - A[0] + 1;
	}

	public static <T> void print(T t, boolean ln) {
		System.out.print(t);
		if (ln) System.out.println();

	}

}