/*47. Given an input string and a dictionary of words, find out if the input string can be segmented into a spa
ce-separated sequence of dictionary words. See following examples for more details.
Consider the following dictionary
{ i, like, sam, sung, samsung, mobile, ice,
cream, icecream, man, go, mango}
Input: ilike
Output: Yes
The string can be segmented as "i like".
Input: ilikesamsung
Output: Yes
The string can be segmented as "i like samsung"
or "i like sam sung".<>
*/
import java.util.Scanner;
public class L2_47 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String Answer="";
		boolean flag=false;
		System.out.print("Enter the String :");
		String input=scan.nextLine();
		// input=input.concat("1");
		String Arr[]= { "i", "like", "sam", "sung", "samsung", "mobile", "ice","cream", "icecream", "man", "go", "mango"};
		for(int i=0;i<Arr.length;i++) {
			String str=input.replace(Arr[i], "");
			System.out.println(str);
			if(!str.equals(input)) {
		 Answer+=Arr[i]+" ";
				flag=true;	
			}
			else 
				flag=false;
			
		}
		scan.close();
		System.out.println(flag);
		System.out.println("The string was segmented as : "+Answer);
	}

}
