/*27.
 * Find whether the given number is palindrome or not. Don’t use arrays or strings*/
import java.util.Scanner;
public class L2_27 {
	private static void CheckPalindrome(long number) {
	long outputNumber=0;
	long inputNumber=number;
	while(number>0) {
		long a=number%10;
		outputNumber+=a;
		outputNumber*=10;
		number/=10;
	}
	outputNumber/=10;
	System.out.println("OutPut : "+((inputNumber==outputNumber)?"PALINDROME":"NOT PALINDROME"));	
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		long Number=scan.nextLong();
       CheckPalindrome( Number);
	}

	
}
