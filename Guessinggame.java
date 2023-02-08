import java.util.*;

public class Guessinggame {

    public static void main (String [] args){
        System.out.println("Let's play a guessing game");
        Scanner s = new Scanner (System.in);
        Random rand = new Random();
        int correctNum = rand.nextInt(20);
        boolean win = false;
        int numTries = 0;
        while (win != true){
            System.out.println("Give me a number, any number:");
            int guess = s.nextInt();
            if (guess == correctNum){
                System.out.println("That is correct!");
                win = true;
            }else{
                System.out.println("Nope, guess again: ");
                numTries += 1;
            }
        }
        s.close();
        System.out.println("Thanks for playing!  It took: " + String.valueOf(numTries) + " tries!");

    } 
    

}