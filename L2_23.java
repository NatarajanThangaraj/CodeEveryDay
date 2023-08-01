
/*23.
 *  Given a number N. find the minimum count of numbers in which N can be represented as a sum of n
umbers x1, x2, … xn. where xi is number whose digits are 0s and 1s.
example 1) i/p : N = 33
o/p : count = 3. 33( 11 + 11 + 11 )
some other possibilities of 33 is (11 + 11 + 10 + 1), (11 + 10 + 10 + 1 + 1 ), (10 + 10 + 10 + 1 + 1 + 1)*/
import java.util.Scanner;

public class L2_23 {
	int count = 0;

	public int repeater(int Number, int Binary) {
		count = Number % Binary;
		count += Number / Binary;
		return count;
	}

	protected int possibilityCounter(int Number) {
		int min = Number;
		int Answer = 0;
		int BasetoBinary = 2;
		int Binary = Integer.parseInt(Integer.toBinaryString(BasetoBinary));
		while (Number >= Binary) {
			Binary = Integer.parseInt(Integer.toBinaryString(BasetoBinary));
			if (Number >= Binary) {
				Answer = repeater(Number, Binary);
				if (min > Answer) {
					min = Answer;
				}
				BasetoBinary++;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		L2_23 l223 = new L2_23();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int Number = scan.nextInt();
		if (Number < 10) {
			System.out.println(Number);
		} else
			System.out.println("Output : " + l223.possibilityCounter(Number) + " Possiblities");
		scan.close();
	}

}
