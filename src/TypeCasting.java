import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //Type Casting
        int num = (int)(67.56f);
        System.out.println(num);

//        automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); //257 % 256 = 1
        System.out.println(b);

    }
}

