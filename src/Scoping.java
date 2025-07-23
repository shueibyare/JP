public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a = 100; // reassign the origin ref variable to some other value.
            System.out.println(a);
             int c = 99;
        }
        System.out.println(a); // cannot assign outside the block.
    }
    static  void  random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
