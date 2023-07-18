/*50.Find the next greater element for each element in given array.
input: array[]={6, 3, 9, 10, 8, 2, 1, 15, 7};
output: {7, 5, 10, 15, 9, 3, 2, _, 8}
If we are solving this question using sorting, we need to use any O(nlogn) sorting algorithm. */
import java.util.Arrays;
public class L2_50{
	public static void main(String[]args){
		int [] Arr={6,3,9,10,8,2,1,15,7};
		Arrays.sort(Arr);
		int [] copyArr={6,3,9,10,8,2,1,15,7};
		int n=Arr.length;
		String [] Ans=new String[n];
		for(int i=0;i<n;i++){
			int y=copyArr[i];
			int index=-1;
			for(int j=0;j<n;j++){
       		if(Arr[j]==y)
           		index=j;
		}
		if(index!=(n-1))
			Ans[i]=(Arr[index+1]+"");
		else
		 Ans[i]="_";	
	} 
	System.out.print("Expected output : ");
for(String s:Ans)
System.out.print(s+",");

}
}

	
		
