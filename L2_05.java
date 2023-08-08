/*
5
 Given a matrix of 2D array of n rows and m coloumns. Print this matrix in ZIG-ZAG fashion as shown in
figure.
Example:
Input:
1 2 3
4 5 6
7 8 9
Output:
1 2 4 7 5 3 6 8 9*/

import java.util.Scanner;
public class L2_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int noOfRows=scan.nextInt();
		System.out.print("Enter the Number of Columns : ");
		int noOfColumns =scan.nextInt();
		int[][] Array=new int[noOfRows][noOfColumns];
		for(int i=0;i<noOfRows;i++) {
			System.out.println((i+1)+"th Row");
			for(int j=0;j<noOfColumns;j++) {
				System.out.print((j+1)+"th num : ");
				Array[i][j]=scan.nextInt();
			}
		}
		scan.close();
		zigZag(Array);

	}

	private static void zigZag(int[][] arr) {
		int rows=arr.length;
		int cols=arr[0].length;
		int row=0,col=0;
		boolean movesUp=true;
		for(int i=0;i<rows*cols;i++) {
			System.out.print(arr[row][col]);
			if(movesUp) {
				if(col==cols-1) {
					row++;
					movesUp=false;
				}
				else if(row==0) {
					col++;
					movesUp=false;
				}
					else {
						row--;
						col++;
					}
				}
			else {
				if(row==rows-1){
					col++;
					movesUp=true;
				}
				else if(col==0) {
					row++;
					movesUp=true;
				}
				else {
					row++;
					col--;
				}
					
			}
							
			}
		}
		
		
	}


