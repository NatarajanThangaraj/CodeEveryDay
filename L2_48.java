/*48.Print the following pattern
1
3 2
6 5 4
10 9 8 7
10 9 8 7
6 5 4
3 2
1*/
public class L2_48 {
	public static void main(String[] args) {
		int n=4,x=1,count = x;
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count-- +" ");	
				x++;
			}
			count=x+(i+1);
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			for(int j=i;j<4;j++) {
				System.out.print(--x+" ");
			}
			System.out.println();
		}


	}

}
