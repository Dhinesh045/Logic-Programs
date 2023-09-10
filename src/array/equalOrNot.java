package array;

public class equalOrNot {
    public static void main(String[] args) {
//        arrays equal or not
        int[] i1={1,2,3,4,5,6};
        int[] i2={1,2,3,4,5};

        boolean result=true;

        if(i1.length==i2.length){
            for(int i=0;i<i1.length;i++){
                if(i1[i]==i2[i]){
                    result=true;
                }

            }
            if(result=true){
                System.out.println("is equal");
            }
            else
                System.out.println("not equal");

        }
        else
            System.out.println("array length is not equal");
    }
}
