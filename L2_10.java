/*10. calculate Maximum number of chocolates can eat and Number of wrappers left in hand.
Money: Total money one has to spend.
Price: price per chocolate.
wrappers: minimum number of wrappers for exchange choco: number of chocolate for wrappers.
Max visit: Maximum number of times one can visit the shop.(if zero consider it infinite)
example: input: Money:40 Price:1 wrappers:3 choco:1 Max visit:1 Output: total chocolate can eat: 53 wrap
pers left in hand:14*/

import java.util.Scanner;

public class L2_10 {

	public static void main(String[] args) {
		L2_10 l210=new L2_10();
l210.getInput();
l210.answers();
	}
	int money=0;
	int price=0;
	int wrappers=0;
	int choco=0;
	int shops=0;
	

	public void getInput() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter how much money you have : ");
		 money=scan.nextInt();
		System.out.print(" price of each choco : ");
		 price=scan.nextInt();
		System.out.print("How many Wrappers for Exchange : ");
		 wrappers=scan.nextInt();
		System.out.print("How much choco for "+wrappers+" wrappers : ");
		 choco=scan.nextInt();
		System.out.print("How many shopes  : ");
		 shops=scan.nextInt();
	}
	public void answers() {
		int eaten_choco = 0;
		int wrappers_in_hand = 0;
//		int another_time=0;
//		int another_wrap=0;
		
	
		 wrappers_in_hand=((money/price)%wrappers)+(money/price)/wrappers;
		 eaten_choco=(money/price)+(money/price)/wrappers;
		 int temp_wrappers=wrappers_in_hand;
		if(shops==0) {
			while(temp_wrappers/wrappers!=0) {
				eaten_choco+=temp_wrappers/wrappers;
				temp_wrappers=(temp_wrappers/wrappers)+(temp_wrappers%wrappers);	
			}
			wrappers_in_hand=temp_wrappers;
		}
		else
		{
			while(shops!=1) {
				eaten_choco+=temp_wrappers/wrappers;
				temp_wrappers=(temp_wrappers/wrappers)+(temp_wrappers%wrappers);
				shops--;
			}
			wrappers_in_hand=temp_wrappers;
		}
		
		System.out.println("total Chocolates can eat : "+eaten_choco);
		System.out.println("Wrappers left in hand : "+wrappers_in_hand);
	}
	

}
