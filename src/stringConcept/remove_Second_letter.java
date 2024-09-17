package stringConcept;

public class remove_Second_letter {
    public static void main(String[] args) {

        String input = "dhinesh kumar";
        String result = removeEverySecondLetterInWords(input);
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }
    public static String removeEverySecondLetterInWords(String str) {

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = removeEverySecondLetter(words[i]);
        }

        String result = String.join(" ", words);
        return result;
    }
    public static String removeEverySecondLetter(String word) {

        int length = word.length();

        char[] resultArray = new char[(length + 1) / 2];
        int resultIndex = 0;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                resultArray[resultIndex] = word.charAt(i);
                resultIndex++;
            }
        }
        String result = new String(resultArray);
        return result;
    }
}
