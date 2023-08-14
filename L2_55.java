
/*55. Find the result subtraction, multiplication, division of two integers using + operator.
Input: 6 and 4
output:
addition 6+4 = 10, subtraction 6+(-4) = 2, multiplication = 24, division = 1
Input : -8 and -4
Output:
addition -8+(-4) = -12, subtraction (-8)+(-(-4)) = -4, multiplication = 32, division = 2*/
import java.util.Scanner;

public class L2_55 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Num-1 : ");
		int num1 = scan.nextInt();
		System.out.print("Enter Num-2 : ");
		int num2 = scan.nextInt();
		result(num1, num2);
		scan.close();
	}

	private static void result(int num1, int num2) {

		System.out.println("Addition : " + (num1 + num2));
		System.out.println("Substraction : " + (num1 + (num2 * -1)));
		int temp=num1;
		int temp1=num2;
		int multiply=0;
			if(num1<0&&num2<0||num1<0) {
				num1=Math.abs(num1);
			num2=Math.abs(num2);
			}
		for(int i=0;i<num1;i++) 
			multiply+=num2;		
		System.out.println("Multiplication : " +multiply );
		num1=temp;num2=temp1;
		 if(num1<0&&num2<0) {
				num1=Math.abs(num1);
				num2=Math.abs(num2);
			}
		else if(num1<0)
			num1=Math.abs(num1);
		else if(num2<0)
			num2=Math.abs(num2);
		int tempNum=0;
		int count=0;
		while(num1/num2>0) {
			//System.out.println(num1+" "+num2);
			tempNum=num1+(num2*-1);
			num1=tempNum;
			count++;
		}
			System.out.println("Division : "+count);

	}

}
