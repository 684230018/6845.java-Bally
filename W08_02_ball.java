import java.util.Scanner;
public class W08_02_ball {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double Celsius = 1.0;

        System.out.print("Enter ur Celsius = ");
        double Fahrenheit = kb.nextDouble();
        double Convert = (Fahrenheit*1.8)+32;
        
        System.out.println("Celsius = "+Fahrenheit+"C"+" Convert To "+"Fahrenheit = "+Convert+"F");
        kb.close();
    }
}