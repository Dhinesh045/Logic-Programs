package stringConcept;

public class divide_letters {

    public static void main(String[] args) {

        String input = "abcdefghijklmnopqrst";
        int n = 4;

        String[] result = divideStringIntoParts(input, n);


        if (result != null) {

            System.out.println("Original String: " + input);
            System.out.println("Divided into " + n + " equal parts:");
            for (String part : result) {
                System.out.println(part);
            }
        } else {
            System.out.println("The string cannot be divided into " + n + " equal parts.");
        }
    }

    public static String[] divideStringIntoParts(String str, int n) {

        int length = str.length();

        if (length % n != 0) {
            return null;
        }

        int partSize = length / n;

        String[] parts = new String[n];

        for (int i = 0; i < n; i++) {
            parts[i] = str.substring(i * partSize, (i + 1) * partSize);
        }

        return parts;
    }
}
