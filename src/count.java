import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=473728;
        int count=0;
        while (i>0) {
            i = i / 10;
            count++;
        }
        System.out.println("number of Digits "+count);
    }
}
