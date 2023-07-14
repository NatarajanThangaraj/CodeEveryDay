/*40
 * 
Given a number, print all the code that can be formed with z={a=1, .., z=26}.
1123
{1, 1, 2, 3} = aabc
{11, 2, 3} = kbc
{1, 1, 23} = aaw
{11, 23} = kw
*/
import java.util.Arrays;
import java.util.Scanner;
public class L2_40 {
	String input;
	public String[] FirstSpliter(String input) {
		this.input=input;
		String Arr1[]=input.split("");
		return Arr1;
	}
	public String[][] MiddleSpliter(String input) {
	this.input=input;
	String Arr2[][]=new String[input.length()-1][input.length()-1];
	
	for(int i=0;i<input.length()-1;i++) {
		int l=0;
		for(int j=0;j<input.length()-1;j++) {
			if(j!=input.length()-1&&i==j) {
				Arr2[i][j]=Character.toString(input.charAt(l++)).concat(Character.toString(input.charAt(l++)));
			}
			else
				Arr2[i][j]=Character.toString(input.charAt(l++));
		}
	}
		return Arr2;
	}
	public String[] LastSpliter(String input) {
		this.input=input;
		int n;
		if(input.length()%2==0)
			n=input.length()/2;
		else
			n=(input.length()/2)+1;
		String Arr3[]=new String[n];
		int count=0;
		if(input.length()%2==0) {
		for(int i=0;i<input.length();i+=2) {
			Arr3[count]=input.substring(i,i+2);
			count++;
		}
		}
		else {
			for(int i=0;i<input.length();i+=2) {
				if(i!=input.length()-1) {
				Arr3[count]=input.substring(i,i+2);
				count++;
				}
				else
					Arr3[count]=input.substring(i,i+1);
			}
		}
		return Arr3;
	}
	
	public void FinalMethod( String Arr[]) {
		
		String FirstAlphabet="";
		for(String eachElement: Arr) {
			char a=96;
			int x=Integer.parseInt(eachElement);
			if(x>26||x==0) {
				continue;
			}
			 a+=x;
			 FirstAlphabet+=a;
			 
		}
		System.out.println(FirstAlphabet);
		
		
	}
	public void MajerTask(String Arr[][]) {
		for(int i=0;i<input.length()-1;i++) {
			System.out.print(Arrays.toString(Arr[i])+" = ");
			FinalMethod(Arr[i]);
		}
	}
	public static void main(String[] args) {
		L2_40 object=new L2_40();
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the Number[No negative Allowed] : ");
	String input=scan.next();
	System.out.print(Arrays.toString(object.FirstSpliter(input))+"=");
	object.FinalMethod(object.FirstSpliter(input));
         object.MajerTask(object.MiddleSpliter(input));
	System.out.print(Arrays.toString(object.LastSpliter(input))+"=");
	object.FinalMethod(object.LastSpliter(input));
	

	scan.close();
	}
}
