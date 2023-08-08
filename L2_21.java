 
/*  Given N. print the following snake pattern (say N = 4). condition: must not use arrays ( 1D array or 2D
array like Matrix ).
1 2 3 4
8 7 6 5
9 10 11 12
16 15 14 13*/
 import java.util.Scanner;
 public class L2_21{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int length=scan.nextInt();
        int count=0;
        for(int i=0;i<length;i++){
             for(int j=0;j<length;j++){
                if(i%2!=0){
                    System.out.printf("%2d ",count--);    
                }
                else{
                    System.out.printf("%2d ",++count );
                }
                if(j==(length-1))
                     count=count+length;
              
        }
        System.out.println();
    }
        scan.close();
 }
}