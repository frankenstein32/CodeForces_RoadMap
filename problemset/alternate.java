import java.util.*;

public class alternate{

	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		while(t-- > 0){


			int n = scn.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i < n;i++){
				arr[i] = scn.nextInt();
			}

			int i = 0, j = 1;
			int sum = 0;
			
			while(j < n){

				if((arr[i] > 0 && arr[j] < 0) || (arr[i] < 0 && arr[j] > 0)){
					sum += arr[i];
					i = j;
				}
				j++;
			}

			System.out.println(sum);
		}
	}
}
