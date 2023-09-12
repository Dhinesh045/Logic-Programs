package stringConcept;

public class findCase {
    public static void main(String[] args) throws Exception {
        String str=null;
        if(str == null || str.equals("")){
           throw new Exception("String shd not be empty");
        }
        char c=str.charAt(0);
        if(c>=97 && c<=122){
            System.out.println(str.toLowerCase());

        }
        else
            System.out.println(str.toUpperCase());
    }
}
