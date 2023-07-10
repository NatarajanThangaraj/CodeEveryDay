/*46.Diamond pattern : for given input size -> Here 3
*
***
*****
***
*
*/
import java.util.Scanner;
public class L2_46 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter input : ");
		int len=scan.nextInt();
		for(int i=1;i<=len;i++) {
			for(int j=i;j<=len;j++)
				System.out.print("  ");
			for(int k=0;k<i;k++)
				System.out.print("* ");
			for(int l=1;l<i;l++)
				System.out.print("* ");
			System.out.println();
		}
		for(int i=1;i<len;i++) {
			for(int j=0;j<=i;j++)
				System.out.print("  ");
			for(int k=i;k<len;k++)
				System.out.print("* ");
			for(int l=i;l<len-1;l++)
				System.out.print("* ");
			System.out.println();
		}
		

	}

}
