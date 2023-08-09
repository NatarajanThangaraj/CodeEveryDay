/*104) Given a string, we have to reverse the string without changing the position of punctuations and spac
es.
Sample: house no : 123@ cbe
Output: ebc32 1o : nes@ uoh*/

import java.util.Arrays;
import java.util.Scanner;
public class L2_104 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the String : ");
	String Input=scan.nextLine();
System.out.println(reverse(Input));
	}

	private static String reverse(String input) {
		String temp="";
		String Answer="";
		for(char each : input.toCharArray()) {
			if(each>='a'&&each<='z'||each>='A'&&each<='Z'||each>='0'&&each<='9')
				temp+=each;
		}
		int index=temp.length()-1;
	char[]Arr=input.toCharArray();
		for(int i=0;i<input.length();i++) {
			if(Arr[i]>='a'&&Arr[i]<='z'||Arr[i]>='A'&&Arr[i]<='Z'||Arr[i]>='0'&&Arr[i]<='9') {
				Arr[i]=temp.charAt(index);
			index--;
			}
		}
for(char x:Arr) {
	Answer+=x;
}
		return Answer;
	}

}
