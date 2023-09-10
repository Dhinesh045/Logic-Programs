package array;

public class findCommon {
    public static void main(String[] args) {
        String[] str={"dhinesh","ranjith","murali"};
        String[] str1={"mani","dhinesh","murali"};
        commonString(str,str1);


    }
    static void  commonString(String[] str, String[] str1)
    {
        for(int i=0;i<str.length;i++)
            for(int j=0;j<str1.length;j++){
                if(str[i]==str1[j]){
                    System.out.println(str[i]);

                }

            }


    }


}
