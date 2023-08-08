/*08.
 *  Q2. Print all possible subsets of the given array whose sum equal to given N.
example: Input: {1, 2, 3, 4, 5} N=6 Output: {1, 2, 3}, {1, 5}, {2, 4}*/

import java.util.Arrays;
import java.util.TreeSet;

public class L2_08 {

	public static void main(String[] args) {
		int[] Input= {2,3,5,8,10};
		possible(Input);
	}
	static void possible(int []arr) {
		TreeSet<Integer>set=new TreeSet<>();
		for(int x:arr)
			set.add(x);
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<=arr.length;j++) {
				if(i!=arr.length-1) {
					//if(arr[i]+arr[j]==6)
				System.out.println(set.subSet(arr[i], arr[j]));	
				}
			}
		}
	}

	}
