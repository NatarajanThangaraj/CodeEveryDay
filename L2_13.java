/*13.Print the word with odd letters – PROGRAM
Sample Output-
P P
R R
O O
G
R R
A A
M M*/
import java.util.Scanner;
public class L2_13 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the text : ");
	String Input=scan.next();
pattern(Input);
	}

	private static void pattern(String text) {
		for(int i=1;i<=text.length();i++) {
			for(int j=1;j<=text.length();j++) {
				if((i==j||i+j==text.length()+1))
					System.out.print(text.charAt(i-1)+" ");
				else
					System.out.print("  ");
			}
				System.out.println();
		}
		
	}

}
