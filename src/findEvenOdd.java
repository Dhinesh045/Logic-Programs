public class findEvenOdd {
    public static void main(String[] args) {
        int i = 44444;
        int even=0;
        int odd=0;
        while (i>0){
            int rem=i%10;
            if(rem%2==0){
                even++;
            }
            else{
                odd++;

            }
            i=i/10;
        }
        System.out.println(even);
        System.out.println(odd);

    }
}