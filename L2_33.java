/*33.
 * First Occurrences
Given two strings, find the first occurrence of all characters of second string in the first string and
print the characters between the least and the highest index
I/P: ZOHOCORPORATION PORT
O/P: OHOCORPORAT*/
import java.util.Scanner;
public class L2_33 {
	public String IndexFinder(String str1,String str2) {
		String Answer="";
		int min=str1.indexOf(str2.charAt(0)), max=str1.indexOf(str2.charAt(0));
		for(int i=1;i<str2.length();i++) {
		int temp,temp1;
		temp=str1.indexOf(str2.charAt(i));
		temp1=str1.indexOf(str2.charAt(i));
		if(temp<min)
			min=temp;
		if(temp1>max)
			max=temp1;
		}
		Answer=str1.substring(min, (max+1));
		return Answer;
	}
	public static void main(String[] args) {
		L2_33 l233=new L2_33();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the 1'st String : ");
		String string1=scan.next();
		System.out.print("Enter the 2'nd String : ");
		String string2=scan.next();
System.out.println("output : "+l233.IndexFinder(string1, string2));
	}

}
