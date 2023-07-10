/*43 . TWISTED PRIME NUMBER
A number is said to be twisted prime if it is a prime number and reverse of the number is also a prime nu
mber.
Input : 97
Output : Twisted Prime Number
Explanation: 97 is a prime number
and its reverse 79 is also a prime
number.*/
import java.util.Scanner;
public class L2_43 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number(please enter more then one digit) :");
		long Num=scan.nextLong();
		long sum=0;
		while(Num!=0) {
			long  RevNum=(Num%10);
			sum*=10;
			sum+=RevNum;
			Num=Num/10;
		}
		//System.out.println(sum);
	
		System.out.println(((sum==1||sum==2)||(sum%2!=0&&sum%3!=0)?"TWISTED PRIME NUMBER":"NOT A PRIME NUMBER"));

	

	}

}
