package array;

public class oddEven {
    public static void main(String[] args) {
        int[] val={1,2,3,4,5};
        int itr=val.length;
        for(int i=0;i<itr;i++)
           if(val[i]%2==0){
               System.out.println(val[i]+ "is even");
           }
        else
               System.out.println(val[i]+ "is odd");
    }
}
