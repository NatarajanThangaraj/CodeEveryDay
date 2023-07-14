/*38.
 * 
 * Given a 6 blocks, of different height h1, …, h6 . Make 2 towers using 3 Blocks for each tower in desired h
eight h1, h2. Print the blocks to be used in ascending order
Input:
1 2 5 4 3 6
height of tower: 6 15
Output :
1 2 3 & 4 5 6*/
import java.util.Arrays;
import java.util.Scanner;
public class L2_38 {
	Scanner scan=new Scanner(System.in);
	int Arr[];
	public int[] Sorter() {
		Arr=new int[6];
		for(int i=0;i<6;i++) {
			 Arr[i]=scan.nextInt();
		}
		Arrays.sort(Arr);
		return Arr;
	} 
	public static void main(String[] args) {
		L2_38 object =new L2_38();
		System.out.println("Enter any SIX numbers :");
		System.out.println(Arrays.toString(object.Sorter()));

	}

}
