/*Pangram Checking
Check whether all english alphabets are present in the given sentence or not
I/P: abc defGhi JklmnOP QRStuv wxyz
O/P: True
I/P: abc defGhi JklmnOP QRStuv
O/P: False*/
import java.util.HashSet;
import java.util.Scanner;
public class L2_31 {
	static boolean CheckPangram(String str) {
		HashSet<Character>set=new HashSet<>();
		int i=0;
		boolean flag1=false,flag2=false;
		while(i<str.length()) {
		if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
			set.add(str.charAt(i));
			flag1=true;
		}
		else if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
			set.add(Character.toLowerCase(str.charAt(i)));
			flag2=true;
		}
		else {
			i++;
			continue;
		}
		i++;
	} 
		return (flag1&&flag2&&set.size()==26);
	}
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the Sentence : ");
	String Sentence=scan.nextLine();
	System.out.println("OUTPUT : "+CheckPangram(Sentence));
	scan.close();

	}

}
