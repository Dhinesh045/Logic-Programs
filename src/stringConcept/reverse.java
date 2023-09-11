package stringConcept;

public class reverse {
    public static void main(String[] args) {
        reverse();
        System.out.println(" ");



    String str= "dhinesh", nstr="";
    char ch;

      System.out.print("Original word: ");
      System.out.println("dhinesh");

      for (int i=0; i<str.length(); i++)
    {
        ch= str.charAt(i);
        nstr= ch+nstr;
    }
      System.out.println("Reversed word: "+ nstr);
}
static void reverse(){
        String str="dhinesh";
        String  val="";
    System.out.print("reverse word is ");
        for(int i=str.length()-1;i>=0;i--){
            char sc=str.charAt(i);
            System.out.print(sc);


        }
}
}
