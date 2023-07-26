
/*26
 * Sort the given elements in decending order based on the number of factors of each element*/
import java.util.Arrays;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class L2_26 {
	static Map<Integer, Integer> map = new HashMap<>();
	static Set<Map.Entry<Integer, Integer>> entryset = new HashSet<>();
	static Set<Integer> keyset = new LinkedHashSet<>();

	private static Map<Integer, Integer> factorsFinder(int intArray[]) {
		for (int eachNumber : intArray) {
			int divider = 1;
			int noOfFactor = 1;
			while (divider <= eachNumber/2) {
				if (eachNumber % divider == 0)
					noOfFactor += 1;
				divider++;
			}
			map.put(eachNumber, noOfFactor);
		}
		return map;
	}

	public static Set<Integer> sorter(Map<Integer, Integer> map) {
		entryset = map.entrySet();
		int[] keyArray = new int[map.size()];
		int[] arrayOfValues = new int[map.size()];
		int count = 0;
		for (Entry eachEntry : entryset) {
			keyArray[count] = (int) eachEntry.getKey();
			arrayOfValues[count] = (int) eachEntry.getValue();
			count++;
		}
		Arrays.sort(arrayOfValues);
		for (int i = arrayOfValues.length - 1; i >= 0; i--) {
			for (Entry eachEntry : entryset) {
				if (eachEntry.getValue() == (Integer) arrayOfValues[i])
					keyset.add((Integer) eachEntry.getKey());
			}
		}
		return keyset;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many Numbers you Give : ");
		int length = scan.nextInt();
		int Numberarray[] = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Enter Arr[" + (i + 1) + "] :");
			Numberarray[i] = scan.nextInt();
		}
		System.out.println(factorsFinder(Numberarray));
		sorter(factorsFinder(Numberarray));
		System.out.println(sorter(factorsFinder(Numberarray)));
		scan.close();
	}

}
