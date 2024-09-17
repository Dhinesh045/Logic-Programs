package StringRecursionSeries;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listExample {
    public static void main(String[] args) {

List<String> names=new ArrayList<>();
names.add("apple");
names.add("orange");
        names.add("pine");
        names.add("orange");
        for(String i : names){
            System.out.println(i);


        }
        System.out.println(names.get(0));
        System.out.println(names.contains("apple"));
        System.out.println(names.remove("orange"));
        System.out.println("    ");
        for(String i : names) {
            System.out.println(i);
        }
        Collections.sort(names);
        System.out.println(names);
        Collections.sort(names,Collections.reverseOrder());
        System.out.println(names);

    }


    }


