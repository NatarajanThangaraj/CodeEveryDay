/*41
 * Given a String with or without special characters find if it is Palindrome or Not.. No splitting of array mu
st be done or No additional spaces must be used for storing the array..
Eg: RACE CAR
Eg: I DID, DID I ?
Eg: "A man, a plan, a canal, Panama!"*/
import java.util.Scanner;
public class L2_41 {
	String ChangedString="";
	String NormalString="";
	public String input, Answer;
	public String Changer(String input) {
		this.input=input;
		for(int i=input.length()-1;i>=0;i--) {
		 if((input.charAt(i)>=65&&input.charAt(i)<=90)||(input.charAt(i)>=97&&input.charAt(i)<=122)||(input.charAt(i)<=48&&input.charAt(i)>=57)) {
			 ChangedString=ChangedString.concat(Character.toString(input.charAt(i)));
		 }
		}
		for(int i=0;i<input.length();i++) {
			 if((input.charAt(i)>=65&&input.charAt(i)<=90)||(input.charAt(i)>=97&&input.charAt(i)<=122)||(input.charAt(i)<=48&&input.charAt(i)>=57)) {
				 NormalString=NormalString.concat(Character.toString(input.charAt(i)));
	}
	}
		if(ChangedString.equalsIgnoreCase(NormalString))
			return "PALINDROME";
		else
			return "NO PALINDROME";
	}
	
	
	
	public static void main(String[] args) {
		L2_41 object=new L2_41();
   Scanner scan=new Scanner(System.in);
   System.out.print("Enter the String : ");
   String input=scan.nextLine();
   System.out.println(object.Changer(input));
	}

}
