/*17.
 * Given an array of integers, compute the maximum value for each integer in the index, by either summi
ng all the digit
• 5
• 120 24 71 10 59 Sum or multiplying all the digits. (Choose which operation gives the maximum value)
• Input:
• Output:
• 3 8 8 1 45*/

import java.util.Scanner;

public class L2_17 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Length : ");
		int N=scan.nextInt();
		int []Array=new int[N];
		for(int i=0;i<N;i++) {
			System.out.print((i+1)+" : ");
			Array[i]=scan.nextInt();
		}
		scan.close();
operate(Array);
	}
	private static int summer(int num) {
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num=num/10;
		}
		return sum;
	}
	private static int multiplier(int num) {
		int value=1;
		while(num!=0) {
			value*=num%10;
			num=num/10;
		}
		return value;
	}

	private static void operate(int[] input) {
	for(int i=0;i<input.length;i++) {
		if(summer(input[i])>multiplier(input[i]))
			System.out.print(summer(input[i])+" ");
		else
			System.out.print(multiplier(input[i])+" ");
	}
	}
		
	}


