import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Find the largest of the 3
//        int max = a;
//        if (b > max){
//            max = b;
//        }if(c > max){
//            max= c;
//        }
        int max = 0;
        if (a > b){
            max = a;
        }else{
            max = b;
        }

        if (c > max) {
            max = c;
        }
        System.out.println(max);


    }
}
