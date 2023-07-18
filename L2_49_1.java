/*49.Given an array as input, The condition is if the number is repeated you must add the number and put t
he next index value to 0. If the number is 0 print it at the last.
Eg: arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8}
Output: 4 2 12 8 0 0 0 0 0 .*/

import java.util.Arrays;
import javax.lang.model.util.ElementScanner14;
public class L2_49_1 {
  public static void main(String []args) {
	int arr[]= {0,1,2,3,4,6,7,8,9,9};
	for(int i=0;i<arr.length;i++) {
		if(i!=arr.length-1&&arr[i]==arr[i+1]) {
			arr[i]=arr[i]+arr[i+1];
			arr[i+1]=0;
			i++;
		}				
		}
	for(int j=0;j<arr.length;j++) {
		if(j!=arr.length-1&&arr[j]==0) {
		int temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
		}			
	}
	System.out.println(Arrays.toString(arr));
  }
}
	 
	 
	 
	
