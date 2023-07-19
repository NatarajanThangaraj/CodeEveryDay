/*35. Matrix Addition
Given n integer arrays of different size, find the addititon of numbers represented by the arrays
I/P: 4
3 5 4 2
2 4 5
4 5 6 7 8
4 9 2 1
1 2
O/P: 50856*/
import java.util.Scanner;
public class L2_35 {
	static Scanner scan=new Scanner(System.in);
	public void method(int Arr[]) {
		long Sum=0;
		for(int i=0;i<Arr.length;i++) {
			String Collecter="";
			System.out.println("-----This is "+(i+1)+" Array-----");
			for(int j=0;j<Arr[i];j++) {
				System.out.print("Enter "+(j+1)+"element :");
				int num=scan.nextInt();
				Collecter+=Integer.toString(num);
			}
			Sum+=Integer.parseInt(Collecter);
		}
		System.out.println("output : "+Sum);
	}
	public static void main(String[] args) {
		L2_35 l235=new L2_35();
		System.out.print("Enter How Many Array you give :");
		int n=scan.nextInt();
		int collectionOfLengths[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print(i+1+"st Array's length :");
			collectionOfLengths[i]=scan.nextInt();
		}
		//System.out.println(Arrays.toString(collectionOfLengths));
l235.method(collectionOfLengths);
	}

}
