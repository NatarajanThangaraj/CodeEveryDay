/*Output: 4 2 12 8 0 0 0 0 0 .
49. Given two Strings s1 and s2, remove all the characters from s1 which is present in s2.
Input: s1=”expErIence”, s2=”En”
output: s1=”exprIece” */

public class L2_49 {
    public static void main(String[]args){
       String s2="Manddetory", s1="Mdtr ";
    int len1=s1.length();
    char x,y;
    for(int i=0;i<len1;i++){
        x=s1.charAt(i);

        for(int j=0;j<s2.length();j++){
            y=s2.charAt(j);
            if(x==y){
                s2=s2.replace(Character.toString(y),"");
            }
        }   
}
System.out.println("Expected output : "+s2);
}  
}

