
/*Problem 37.:
Evaluate the expression and sort and print the output. Getting the input is the tricky part
Input:
Number of input : 4
2*3
2^2^2
35
3*1
Output:
3*1
2*3
2^2^2
35*/
import java.util.Arrays;
import java.util.Scanner;

public class L2_37 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Input :");
		int n = scan.nextInt();
		scan.nextLine();
		int Arr2[] = new int[n];
		String Arr[] = new String[n];
		System.out.println("Enter the Array Elements:");
		for (int i = 0; i < n; i++) {
			Arr[i] = scan.nextLine();
			String Arr1[];
			if (Arr[i].contains("*")) {
				Arr1 = Arr[i].split("\\*");
				Arr2[i] = Integer.parseInt(Arr1[0]);
				for (int j = 1; j < Arr1.length; j++) {
					//System.out.println(Arr2[i]);
					Arr2[i] =Arr2[i]* Integer.parseInt(Arr1[j]);
				}
			} else if (Arr[i].contains("^")) {
				Arr1 = Arr[i].split("\\^");
				int mult = 1;
				//System.out.println(Arrays.toString(Arr1));
				for (int j = 1; j < Arr1.length; j++) {
					mult *= Integer.parseInt(Arr1[j]);
				}
				Arr2[i]=(int)Math.pow((double)Integer.parseInt(Arr1[0]),(double) mult);

			} else if (Arr[i].contains("+")) {
				Arr1 = Arr[i].split("\\+");
				for (int j = 0; j < Arr1.length; j++) {
					Arr2[i] += Integer.parseInt(Arr1[j]);
				}
			}
			 else if (Arr[i].contains("-")) {
					Arr1 = Arr[i].split("\\-");
					Arr2[i] = Integer.parseInt(Arr1[0]);
					for (int j = 1; j < Arr1.length; j++) {
						Arr2[i] -= Integer.parseInt(Arr1[j]);
					}
				}
			 else
				 Arr2[i]=Integer.parseInt(Arr[i]);
		}
		System.out.println(Arrays.toString(Arr2));

	}

}
