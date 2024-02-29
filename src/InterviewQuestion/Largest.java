package InterviewQuestion;

public class Largest {
    public static void main(String[] args) {
        int arr[] ={5,4,23,56};
       int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        System.out.println("the Largest Number is " +largest);
    }
}
