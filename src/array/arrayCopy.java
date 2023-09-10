package array;

public class arrayCopy {
    public static void main(String[] args) {
        int[] i1={1,2,3,4,5};
        int[] i2= new int[i1.length];
        for(int i=0;i<i1.length;i++){
            i2[i]=i1[i];
            System.out.print(i1[i]);
        }
        System.out.println(" ");
    for(int j=0;j<i1.length;j++){
        System.out.print(i2[j]);
    }
    }

}
