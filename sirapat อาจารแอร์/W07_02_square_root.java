import java.util.Scanner;

public class W07_02_square_root {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Input: prompt the user for a number
        System.out.print("Enter a number");
         Double x = kb.nextDouble();
         
         double squareRoot = Math.sqrt(x);
         if (x > 0) {
         //Process: calculate the square root of the number
         // Output the square root of the number
         System.out.println(x+"is"+squareRoot);
        } else { 
         System.out.println("Error กรอกเลขจำนวนเท่านั้น");
            
         }
    }
}
