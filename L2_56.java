/*56..Given a sentence of string, in that remove the palindrome words and print the remaining.
Input:
He did a good deed
Output:
He good
Input:
Hari speaks malayalam
Output:
Hari speaks*/

import java.util.Scanner;

public class L2_56 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String Input=scan.nextLine();
		System.out.println("output : "+remove_palindrome(Input)); 

	}

	private static String remove_palindrome(String input) {
		String[]InputArray=input.split(" ");
		String Answer="";
		for(int i=0;i<InputArray.length;i++) {
			String temp="";
			for(int j=InputArray[i].length()-1;j>=0;j--) {
				temp+=InputArray[i].charAt(j);
			}
			if(temp.equalsIgnoreCase(InputArray[i])) {
				continue;
			}
			else
				Answer+=InputArray[i]+" ";
			
			
		}
		
		return Answer;
	}

}
