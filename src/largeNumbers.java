public class largeNumbers {
     int largest(){
int[] i={2,3,5,2,9,4568};
int max=i[0];
for(int j=1;j<i.length;j++)
    if(i[j]>max)
        max=i[j];
return max;
    }
    public static void main(String[] args) {
       largeNumbers obj=new largeNumbers();

        System.out.println( obj.largest());

    }
}
