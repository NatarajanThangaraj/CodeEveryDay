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
		System.out.print("Enter the N of Array :");
		int n = scan.nextInt();
		scan.nextLine();
		int Arr2[] = new int[n];
		String Arr[] = new String[n];
		System.out.println("Enter the Array Elements:");
		int i=0;
	while(i<n) {
			Arr[i] = scan.nextLine();
			String Arr1[];
			if (Arr[i].contains("*")) {
				Arr1 = Arr[i].split("\\*");
				Arr2[i] = Integer.parseInt(Arr1[0]);
				for (int j = 1; j < Arr1.length; j++) {
					Arr2[i] = Arr2[i] * Integer.parseInt(Arr1[j]);
				}
				i++;
			} else if (Arr[i].contains("^")) {
				Arr1 = Arr[i].split("\\^");
				int mult = 1;
				for (int j = 1; j < Arr1.length; j++) {
					mult *= Integer.parseInt(Arr1[j]);
				}
				Arr2[i] = (int) Math.pow((double) Integer.parseInt(Arr1[0]), (double) mult);
i++;
			} else if (Arr[i].contains("+")) {
				Arr1 = Arr[i].split("\\+");
				for (int j = 0; j < Arr1.length; j++) {
					Arr2[i] += Integer.parseInt(Arr1[j]);
				}
				i++;
			}  else
				Arr2[i] = Integer.parseInt(Arr[i]);
		}
		System.out.println(Arrays.toString(Arr2));
		for (int k = 0; k < Arr2.length; k++) {
			for (int j = k + 1; j < Arr2.length; j++) {
				if (Arr2[k] > Arr2[j]) {
					String temp1 = Arr[k];
					Arr[k] = Arr[j];
					Arr[j] = temp1;
				}
			}
		}
		System.out.println(Arrays.toString(Arr));
	}

}
