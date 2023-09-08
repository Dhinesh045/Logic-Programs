import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
//        reverse a number

        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int rev=0;
        while(i>1){
    rev=rev*10 + i%10;
    i=i/10;
        }
        System.out.print(rev);
    }
}
