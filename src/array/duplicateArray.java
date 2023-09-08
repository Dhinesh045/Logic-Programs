package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicateArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,45,55,3,32,22,22,55,1));
        Set<Integer> intContainer = new HashSet<>();
        System.out.println("Duplicate numbers are: ");
        for(int number : arr) {

            if(intContainer.add(number) == Boolean.TRUE)  {
                System.out.println(number);
            }
        }
    }
}

