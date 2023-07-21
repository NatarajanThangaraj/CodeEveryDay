import java.util.Scanner;
public class L2_30 {
	public void Pattern(int len) {
		int x=1;
		for(int i=0;i<len;i++) {
			for(int k=0;k<=i;k++) {
				if(i%2!=0) {
				if(k%2!=0)
					x=1;
				else
					x=0;
				}
				else {
					if(k%2!=0)
						x=0;
					else
						x=1;
				}
				System.out.print(x+" ");
			}
				System.out.println();
			
		}
	}
	public static void main(String[] args) {
		L2_30 l230=new L2_30();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the N : ");
		int n=scan.nextInt();
    l230.Pattern( n);
	}

}
