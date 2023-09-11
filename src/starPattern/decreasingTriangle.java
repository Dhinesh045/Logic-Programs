package starPattern;

public class decreasingTriangle {
    public static void main(String[] args) {
        anotherMethod();
        for (int i = 5; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void anotherMethod(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("&");
            }
            System.out.println(" ");
        }
    }
}
