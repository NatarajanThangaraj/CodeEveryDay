/*
11.
Sample Input-
2
Hacker
Rank
Sample Output-
Hce akr
Rn ak*/

import java.util.Scanner;

public class L2_11 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("How many Strings you Give : ");
	int N=scan.nextInt();
	String []arr= new String [N];
	for(int i=0;i<N;i++) {
		System.out.print("string "+(i+1)+": ");
	arr[i]=scan.next();
	}
   divisor(arr);
	}

	private static void divisor(String[] arr) {
	for(String str:arr) {
		String oddIndex="";
		String evenIndex="";
		for(int i=0;i<str.length();i++) {
			if(i%2!=0)
				oddIndex+=str.charAt(i);
			else
				evenIndex+=str.charAt(i);
		}
		System.out.println(evenIndex+" "+oddIndex);
	}
		
	}
	

}
