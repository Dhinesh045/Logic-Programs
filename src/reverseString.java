public class reverseString {
    public static void main(String[] args) {
        String s = "dhinesh";
        String n = "";
        int l = s.length();
        for (int i = l - 1; i>= 0; i--) {
            n = n + s.charAt(i);

        }
        System.out.print(n);
    }
}