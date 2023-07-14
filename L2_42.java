/*42. 
 * Given an array of integers of size n. Convert the array in such a way that if next valid number is same
as current number, double its value and replace the next number with 0. After the modification, rearrange
the array such that all 0’s are shifted to the end.
Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0
Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output : 4 2 12 8 0 0 0 0 0 0*/

import java.util.Arrays;

public class L2_42 {
int input[]= {2,-1,-3,-3,0,2};
int output[]=new int[input.length];
String Answer;
int count=0;
public String method() {
	for(int i=0;i<input.length;i++) {
		if((i!=input.length-1)&&(input[i]==input[i+1])) {
			input[i]+=input[i+1];
			input[i+1]=0;
	}		
		if(input[i]!=0) {
			output[count]=input[i];
			count++;
			input[i]=0;
		}
		}
	Answer=Arrays.toString(output);
	return Answer ;
}
	public static void main(String[] args) {
	L2_42 object=new L2_42();
	System.out.println(object.method());

	}

}
