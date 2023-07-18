
/*38.
 * Given a 6 blocks, of different height h1, …, h6 . Make 2 towers using 3 Blocks for each tower in desired h
eight h1, h2. Print the blocks to be used in ascending order
Input:
1 2 5 4 3 6
height of tower: 6 15
Output :
1 2 3 & 4 5 6*/
import java.util.Arrays;
import java.util.Scanner;
public class L2_38 {
	public void Finder(int Arr[], int height) {
		loop1: for (int i = 0; i < Arr.length; i++) {
			for (int j = i + 1; j < Arr.length; j++) {
				for (int k = j + 1; k < Arr.length; k++) {
					if (i != Arr.length - 1 && Arr[i] + Arr[j] + Arr[k] == height) {
						System.out.println(Arr[i] + " " + Arr[j] + " " + Arr[k] + " ");
						Arr[i] = Arr[j] = Arr[k] = 0;
						break loop1;
					}

				}

			}
			if (i == Arr.length - 1)
				System.out.println("Sorry!we unable to built the " + height + " height tower using 3 blocks");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		L2_38 l238 = new L2_38();
		System.out.println("Enter the  6 blocks height ");
		int arr[] = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.print("h" + (i + 1) + "=");
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Enter the 1st tower height :");
		int firstTower = scan.nextInt();
		System.out.print("Enter the 2nd tower height :");
		int secondTower = scan.nextInt();
		l238.Finder(arr, firstTower);
		l238.Finder(arr, secondTower);
		scan.close();
	}

}
