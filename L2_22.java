/*22.
 * Given N. print the Latin Matrix (say N = 3). condition: must not use strings(aka character literals), arra
ys (both 1D and 2D), inbuilt functions(like rotate).
A B C
B C A
C A B
*/
import java.util.Scanner;
public class L2_22 {
static void Matrix(int len) {
	for(int i=0;i<len;i++) {
		for(int j=0;j<len;j++) {
			int Alpha=(i+j)%len+'A';
			System.out.print((char)Alpha+" ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Length of Matrix : ");
		int length=scan.nextInt();
		Matrix(length);
		scan.close();
	}

}
