package array;

public class ArrayConcept {
    static void check(int[] index,int checkValue){
        boolean b=false;
        for(int i=0;i<=index.length-1;i++)
            if(index[i]==checkValue)
            {
                System.out.println(checkValue+ "is equal to "+index[i]);
            }
    }

    public static void main(String[] args) {
        int[] index = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int checkValue=7;
check(index,checkValue);

    }
}
