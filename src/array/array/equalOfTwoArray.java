package array.array;

public class equalOfTwoArray {
    public static void main(String[] args) {
        int[] n1={1,2,3,4,5};
        int[] n2={1,2,3,4,6};
        if(n1.length==n2.length)
        {
           for(int i=0;i<n1.length;i++){
               if(n1[i]==n2[i]){
                   System.out.println(n1[i]+ " is equal to "+n2[i]);
               }
               else
                   System.out.println(n1[i]+ "not equal to " + n2[i]);
           }
        }
        else
            System.out.println("nott equal");
    }
}
