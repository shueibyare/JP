import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
        String day = in.next();

//        if (fruit.equals("mango")){
//            System.out.println("King of fruits");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("Testy fruit");
//        }
//        switch(fruit) {
//            case "Mango":
//                System.out.println("Great fruit");
//                break;
//            case "Apple":
//                System.out.println("Nice fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            default:
//                System.out.println("Please, enter a valid fruit");
//        }
        switch(day) {
            case "1","2","3","4","5" -> System.out.println("weekday");
            case "6","7" -> System.out.println("weekend");
        }
    }
}
