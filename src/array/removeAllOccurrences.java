package array;

public class removeAllOccurrences {
//    Remove all occurrences of an element from Array in Java
    public static void main(String[] args) {
        int[] index={1,2,2,3,6,7,2,6,4,9,2};
        int len=index.length;
        int key=2;
        occurance(index,key);
    }
    static int occurance(int[] index,int key){
        int store=0;
        for(int i=0;i< index.length;i++){
            if(index[i]!=key){
                store=index[i];
                System.out.print(store);
            }
        }
return store;
    }
}
