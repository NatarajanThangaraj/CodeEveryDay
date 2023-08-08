/*14.
Sample Input – Alternate Sorting
Input: {1, 2, 3, 4, 5, 6, 7}
output: {7, 1, 6, 2, 5, 3, 4}*/

import java.util.Arrays;
import java.util.Scanner;

public class L2_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the N of Array : ");
		int len = scan.nextInt();
		int[] Array = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.print((i + 1) + ": ");
			Array[i] = scan.nextInt();
			scan.close();
		}
		Arrays.sort(Array);
		System.out.println(Arrays.toString(alternate_sort(Array, len)));
	}

	private static int[] alternate_sort(int []Array,int N) {
		int[]temp_arr=new int[N];
		int index=0;
		int index1=N-1;
		for(int i=0;i<N;i++) {
			if(i%2==0) {
				temp_arr[i]=Array[index1];
				index1--;
			}
			else {
				temp_arr[i]=Array[index];
				index++;
			}
		}
		return temp_arr;
	}

}
