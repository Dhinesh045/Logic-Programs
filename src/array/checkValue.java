package array;

public class checkValue {
    static void check(int[] index,int checkValue){
        boolean b=true;
        for(int i=0;i<=index.length-1;i++)
            if(index[i]==checkValue)
            {
                System.out.println(checkValue+ "is equal to "+index[i]);
            }
        if(b=false){
            System.out.println("not equal");
        }
    }

    public static void main(String[] args) {
        int[] index = {1, 2, 3, 4, 5, 6, 5, 7, 9};
        int checkValue=7;
check(index,checkValue);

    }
}
