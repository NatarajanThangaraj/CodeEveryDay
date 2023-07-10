
import java.util.Scanner;
import java.util.LinkedHashSet;

public class L2_44 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedHashSet<Integer>List=new LinkedHashSet<>();
		System.out.print("Enter the \"n\" of the array :");
		int n = scan.nextInt();
		int Arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the " + i + " Number of Array :");
			Arr[i] = scan.nextInt();
		}
	System.out.print("Enter the Sum :");
		int sum = scan.nextInt();
		int count=0;
	 for(int i=0;i<n;i++) {
		 for(int j=i;j<n;j++) {
		  if(i!=n-1&&(Arr[i]+Arr[j]==sum)&& Arr[i]!=Arr[j]) {
			 List.add(Arr[i]);
			 List.add(Arr[j]);
			 count++;
		 }	 
		 
		 }
	 }
	 System.out.println(count+" "+List);
	}

}
