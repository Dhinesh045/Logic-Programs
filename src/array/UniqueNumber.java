package array;

import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        int r1, r2, num1, num2, number, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        number = sc.nextInt();
        num1 = number;
        num2 = number;
        while (num1 > 0) {
            r1 = num1 % 10;
            while (num2 > 0) {
                r2 = num2 % 10;
                if (r1 == r2) {
                    count++;
                }
                num2 = num2 / 10;
            }
            num1 = num1 / 10;

        }
        if (count == 1) {
            System.out.println("the number is unique");
        } else {
            System.out.println("the number is not unique");
        }
    }
}
