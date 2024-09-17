import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
//String s="111";
//
//int len= s.length();
//String rev="";
// for(int i=len-1;i>=0;i--){
//     rev =rev + s.charAt(i);
// }if(rev == s)
//        System.out.println( s+ " palindrome");
//else {
//            System.out.println(s+ " not Palindrome");
//        }
Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
int val=sc.nextInt();

       int rev=0;
       int original = val;
      while(val!=0) {
          rev = rev * 10 + val % 10;
          val = val / 10;
      }
       if(original==rev){
           System.out.println("palindrome");

           }
       else {
           System.out.println("not palindfrom");
       }

       }

    }



