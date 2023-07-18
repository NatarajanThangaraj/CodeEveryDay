/*48.Print the following pattern
1
3 2
6 5 4
10 9 8 7
10 9 8 7
6 5 4
3 2
1*/
import java.util.Scanner;
public class L2_48 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the N :");
		int n=scan.nextInt();
		int x=1,count = x;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count-- +" ");	
				x++;
			}
			count=x+(i+1);
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(--x+" ");
			}
			System.out.println();
		}


	}

}
