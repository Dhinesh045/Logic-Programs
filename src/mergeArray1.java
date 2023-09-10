import java.util.Arrays;

public class mergeArray1 {
    public static void main(String[] args) {
        int[] index={3,3,4,4};
        int[] index2={9,8,7,6};
        int i1=index.length;
        int i2=index2.length;
        int c=i1+i2;
        int[] c1= new int[c];

        System.arraycopy(index,0,c1,0,i1);
        System.arraycopy(index2,0,c1,i1,i2);
        System.out.println(Arrays.toString(c1));

    }



    }

