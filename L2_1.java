/*Given an array of integers, replace every element with the next greatest element (greatest element on the
right side) in the array. Since there is no element next to the last element, replace it with -1. For example,
if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}. */
public class L2_1{
public static void main(String []args){
int []Arr={16,17,4,3,5,2};
int n=Arr.length,lastElement,i,j;
int []Ans=new int[n];
for(i=0;i<n;i++){
	lastElement=-1;
	for(j=i+1;j<n;j++){
     lastElement=Math.max(lastElement,Arr[j]);
	}
	 Ans[i]=lastElement;
}
System.out.print("Expected Array : ");
for(int x:Ans){
System.out.print(x+" ");
}

		}
		
	}

	

//for(int x:Ans)
//	System.out.println(x);





