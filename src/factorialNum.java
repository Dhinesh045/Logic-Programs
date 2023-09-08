import org.w3c.dom.ls.LSOutput;

public class factorialNum {
    public static void main(String[] args) {
        int val = 10;
        long str = 1;
        for (int i = 1; i <= val; i++) {
            str = str * i;
        }
        System.out.println(str);
    }
}