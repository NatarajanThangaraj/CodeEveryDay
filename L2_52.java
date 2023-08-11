/*52.Given a number, find the next smallest palindrome*/

import java.util.Scanner;

public class L2_52 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				System.out.print("Enter the Number :");
				int num=scan.nextInt();
				System.out.println(nearest_palindrome(num+1));
scan.close();
	}
	private static int nearest_palindrome(int num) {
int temp=num;
int palind=0;
while(temp!=0) {
	palind=(palind*10)+temp%10;
	temp/=10;
}
if(num==palind)
	return palind;
	else 
		return nearest_palindrome( num+1);
	}

}
