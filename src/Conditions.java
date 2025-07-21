public class Conditions {
    public static void main(String[] args) {
        /*
        syntax of if statements:
        if (boolean expression T or F) {
         //body
        }else{
          //do this
        }
        * */

        int salary = 2400;
        if(salary > 10000) {
            salary = salary + 2000;
        }else {
            salary = salary + 1000;

        }
        System.out.println(salary);
    }
}
