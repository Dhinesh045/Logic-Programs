package stringConcept;

import java.util.Arrays;
import java.util.Collections;

public class sortString {
    public static void main(String[] args) {
        reverse();

        String str = "qwertyuioplkjhgfdsazxcvbnm";
        char arr[] = str.toCharArray();
        char temp;


        for (int i = 0;i < arr.length;i++) {

            for (int j = i + 1;j < arr.length;j++) {
                if (arr[i] > arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }


        System.out.println(arr);
    }
    static void reverse(){
        String[] index={"v","d","e"};
        Arrays.sort(index);
        Arrays.sort(index, Collections.reverseOrder());
        System.out.println(Arrays.toString(index));
    }
}
