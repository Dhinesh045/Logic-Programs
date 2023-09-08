public class primeOrNot {
    public static void main(String[] args) {
        for(int i=2;i<=5;i++)
            if (i % 2 == 0) {
                System.out.println(i + " is not prime");
            }
        else{
            System.out.println(i+ " is prime ");
        }
    }
}