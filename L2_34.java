
/*34.
 *  Matrix Diagonal sum
Given a matrix print the largest of the sums of the two triangles split by diagonal from top right to bottom l
eft
I/P:
3 3
1 2 3
4 5 6
7 8 9
O/P: 38*/
import java.util.Scanner;

public class L2_34 {
	public int Matrix(int n) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - 1; j++)
				count++;
			for (int k = 0; k <= i; k++) {
				count++;
				sum += count;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		L2_34 l234 = new L2_34();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n of Matrix :");
		int n = scan.nextInt();
		System.out.println("output :" + l234.Matrix(n));

	}

}
