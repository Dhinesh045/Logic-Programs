package array;

public class maxAndMin {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8};
        int max=num[0];
        for(int i=1;i<num.length;i++)

        {
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println(max);
    }
}
