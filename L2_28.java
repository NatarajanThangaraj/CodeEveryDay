/*28
 * .Reverse the given string keeping the position of special characters intact*/
import java.util.Scanner;
public class L2_28 {
	public String removeSpecChar(String str) {
		String Model="";
		for(int i=0;i<str.length();i++) {
			char n=str.charAt(i);
			char a=Character.toUpperCase(str.charAt(i));
			if(a>=65&&a<=90) {
				for(int j=str.length()-1;j>=0;j--) {
					char b=Character.toUpperCase(str.charAt(j));
				if(b<=65||b>=90)
					continue;
				else 
					 n=str.charAt(j);
				Model+=n;
				}
				
			}
			else
				Model+=str.charAt(i);
		}
		return Model;
	}
	public static void main(String[] args) {
		L2_28 l228=new L2_28();
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the String : ");
	String Text=scan.next();
	System.out.print(l228.removeSpecChar(Text));
	scan.close();
	}

}
