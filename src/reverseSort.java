import java.util.Arrays;
import java.util.Collections;

public class reverseSort {
    public static void main(String[] args) {
        Integer array[]={3,4,0,5,6,7,8};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
