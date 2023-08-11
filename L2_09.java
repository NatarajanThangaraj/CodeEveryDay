/*}
9. Reverse the words in the given String1 from the first occurrence of String2 in String1 by maintaining wh
ite Spaces.
example: String1 = Input: This is a test String only String2 = st Output: This is a only String test*/

import java.util.Arrays;
import java.util.Scanner;
public class L2_09 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("string-1 : ");
		String str1=scan.nextLine();
		System.out.print("string-2 : ");
		String str2=scan.nextLine();
		
System.out.println(stringChanger(str1,str2));
	}

	private static String stringChanger(String str1, String str2) {
		String[] strArr=str1.split(" ");
		String ans="";
		for(int k=0;k<strArr.length;k++) {
	if(strArr[k].contains(str2)) {
		String temp=strArr[k];
		strArr[k]=strArr[strArr.length-1];
		strArr[strArr.length-1]=temp;
		break;
	}
		}
		for(String x:strArr)
			ans+=x+" ";
		return ans;
	}

}
