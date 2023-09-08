package array.array;

import java.util.Arrays;

public class arrayConcept_2 {
    public static void main(String[] args) {
        int[] org_arr={3,5,6,2,3,9};
        System.out.println("this is original array ");
        for(int i : org_arr){
            System.out.print(i);
        }
       Arrays.sort(org_arr);
        System.out.println(" ");
        System.out.println("the sort array");
        for (int j : org_arr) {
            System.out.print(j);
        }
    }
}
