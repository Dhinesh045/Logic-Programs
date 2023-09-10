package array;

public class findMax {
    static int[] index = {1, 2335, 33, 42, 4, 5, 35, 667,};

    public static void main(String[] args) {

        System.out.println("the maximum value is"+ large());
    }

    static int large() {
            int max=index[0];
            for(int i=0;i<index.length;i++)
                if(max<index[i]){
                    max=index[i];
                }

        return max;
    }
}
