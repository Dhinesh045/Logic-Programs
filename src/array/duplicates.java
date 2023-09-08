package array;

public class duplicates {
    public static void main(String[] args) {
        String[] str={"india","modi","barath","iNdia"};
        boolean qn=false;
        for(int i=0;i<str.length;i++){
            for (int j=i+1;j<str.length;j++)
            {
                if(str[i]==str[j]){
                    System.out.println(" found the duplicate " + str[i]+ " "+str[j]);
                    qn=true;
                }

            }
        }
if(qn==false)
    System.out.println("no duplicate found");
    }
}
