package stringConcept;

public class swapPairString {
    static String swap(String str){
        char[] ch=str.toCharArray();
        if(!str.isEmpty()){
            for(int i=0;i<str.length()-1;i+=2){
               char temp=ch[i];
               ch[i] =ch[i+1];
               ch[i+1]=temp;


            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str="DKDKDKDk";

        System.out.println(swap(str));

    }
}