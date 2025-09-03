
import java.util.Scanner;

public class W02_02_ {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Value A");
        int a = kb.nextInt();
        System.out.println("Enter Value B ");
        int b = kb.nextInt();

        System.out.println("Before : output of Value A = "+ a );
        System.out.println("Before : output of Value B = "+ b );
        // Swap value
        int temp = a;
        a = b;
        b = temp;
         System.out.println("After : output of Value B = "+ a );
         System.out.println("After : output of Value B = "+ b );


         
         int x = 6;
         System.out.println(x-- + ++x - --x - x-- + x++ + x);
         int x = 21, b = 0;
         System.out.println("a" + (a ));



    }
}
