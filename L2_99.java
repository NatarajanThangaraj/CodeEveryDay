/*
99. Given an odd length word which should be printed from the middle of the word.
The output should be in the following pattern.
Example:
Input: PROGRAM
Output:
G
GR
GRA
GRAM
GRAMP
GRAMPR
GRAMPRO
*/
import java.util.Scanner;
public class L2_99{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Odd-length string : ");
		String Input=scan.nextLine();
		scan.close();
		pattern(Input);
	}
	private static void pattern(String str){
		for(int i=0;i<str.length();i++){
			int count=(str.length()/2);
			for(int j=i;j<str.length();j++)
				System.out.print("  ");
			for(int k=0;k<=i;k++){
				if(count==str.length()-1){
					System.out.print(str.charAt(count++)+" ");
					count=0;
					
				}
				else{
				System.out.print(str.charAt(count++)+" ");
				}
			
				
				
			}
			
			System.out.println();
			
		}
		
	}
}

