
/*Password Strength
Find the strength of the given password string based on the conditions
Four rules were given based on the type and no. of characters in the string.
Weak – only Rule 1 is satisfied or Rule 1 is not satisfied
Medium – Two rules are satisfied
Good – Three rules satisfied
Strong – All Four rules satisfied
I/P: Qw!1 O/P: Weak
I/P: Qwertyuiop O/P: Medium
I/P: QwertY123 O/P: Good
I/P: Qwerty@123 O/P: Strong
*/
import java.util.Scanner;

public class L2_32 {
	String Answer = "";

	public String Ruler(String str) {
		boolean flag1 = false, flag2 = false, flag3 = false, flag4 = false;
		if (str.length() < 8) {
			Answer = "Weak";
			return Answer;
		}
		int i = 0, count = 0;
		while (i < str.length()) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90 && !flag1) {
				count++;
				flag1 = true;
			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122 && !flag2) {
				count++;
				flag2 = true;
			} else if (str.charAt(i) >= 47 && str.charAt(i) <= 57 && !flag3) {
				if (!flag3)
					;
				count++;
				flag3 = true;
			} else if (str.charAt(i) >= 33 && str.charAt(i) <= 46 && !flag4) {
				if (flag4 == false)
					;
				count++;
				flag4 = true;
			}
			i++;
		}
		Answer = (count == 1) ? "WEAK"
				: (count == 2) ? "MEDIUM" : (count == 3) ? "GOOD" : (count == 4) ? "STRONG" : "WEAK";
		return Answer;
	}

	public static void main(String[] args) {
		L2_32 l232 = new L2_32();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Password : ");
		String passWord = scan.nextLine();
		System.out.println("your password is " + l232.Ruler(passWord));
	}

}
