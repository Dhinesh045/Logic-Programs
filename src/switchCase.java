public class switchCase {
    public static void main(String[] args) {
        switch ("food"){
            case "food" :
                switch ("nonveg"){
                    case "nonveg" :
                        System.out.println("mushroom");
                    case " veg" :
                        System.out.println("non veg");
                        break;
                    default:
                        System.out.println("null");
                }
;
            case "drink" :
                System.out.println("not break");

        }
    }
}
