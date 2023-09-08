import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.next();
        String rev = "";
        String org_str=str;
        for(int i=str.length()-1;i>=0;i--){
            rev +=str.charAt(i);
        }
        if(org_str.equals(rev)){
            System.out.println(rev+" isPalindrome");
        }
else
            System.out.println(rev+" isNotPalindrome");
    }
}
