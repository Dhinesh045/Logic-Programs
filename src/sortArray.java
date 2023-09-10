import java.util.Arrays;



public class sortArray {
    public static void main(String[] args) {
        sortArr();

    }

    public static void sortArr() {
        int[] arr = {2, 4, 5, 7, 8, -2, 4, 6, 899, 3};
        int min = arr[0];
        System.out.println("original array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("sort array");
        Arrays.sort(arr);
        for (int j : arr) {
            int sortValue = j;
            System.out.print(sortValue + " ");

        }


    }
}



