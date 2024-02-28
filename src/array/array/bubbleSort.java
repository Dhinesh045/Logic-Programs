package array.array;

public class bubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 1; j < (n - i); j++) {

                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {3, 1, 6, 4, 89, 70};
        bubbleSort(a);
        for (int i = a.length-1; i >=0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
