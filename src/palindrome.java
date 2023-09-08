import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int i=sc.nextInt();
        int rev=0;
        int org_num=i;
       while(i>1) {
           rev = rev*10 + i%10;
           i = i/10;
       }
       if(org_num==rev) {
           System.out.println(org_num + " isPalindrome");
       }
       else
           System.out.println(org_num+" isNotPalindrome");
    }
}
