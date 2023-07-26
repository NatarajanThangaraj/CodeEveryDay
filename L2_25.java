
/*25. Given an array of integers, write a program to re-arrange the array in the given form.
1st_largest, 1st_smallest, 2nd_largest, 2nd_smallest, 3rd_largest ……. etc.*/
import java.util.Scanner;
import java.util.Arrays;

public class L2_25 {
	static int[] Solution(int[] Numbers) {
		int Arr[] = new int[Numbers.length];
		int count = 0;
		for (int k = 0; k < Numbers.length; k++) {
			if (k % 2 == 0) {
				Arr[k] = Numbers[Numbers.length - count - 1];
			} else {
				Arr[k] = Numbers[count];
				count++;
			}
		}
		System.out.println(Arrays.toString(Numbers));
		return Arr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter How many Numbers : ");
		int length = scan.nextInt();
		int Array[] = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Enter Arr[" + (i + 1) + "] :");
			Array[i] = scan.nextInt();
		}
		Arrays.sort(Array);
		System.out.println(Arrays.toString(Solution(Array)));
		scan.close();
	}

}
