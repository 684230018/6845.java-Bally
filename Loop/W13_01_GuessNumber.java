package Loop;

import java.util.Random;
import java.util.Scanner;

public class W13_01_GuessNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random ra = new Random();

        int answer = kb.nextInt(10)+1;

        //System.out.println("Random number is generated : "+ answ );

        int countGuess = 0 ;
        boolean win = false;
        while(countGuess < 3) {
        System.out.println("Enter your  guess (1-10): ");
        int x = kb.nextInt();

        if(answer==x){
        System.out.println("Correct! you've gussed the number.");
        System.out.println("===============WIN================");
        win = true;
        break;  
        }else{
        System.out.println("Incorrect guss. Try again,");
        System.out.println("================LOSE===============");
        } 
        countGuess++;
        
        }
        if(win == false)
        System.out.println("Game Over. The coeerct number was"+answer);

        kb.close();

    }
}
