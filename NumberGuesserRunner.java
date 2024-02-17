

/**
 * 
 * 
 * @version 10-11-2021
 * @author Hudson Stimmler
 */
import java.util.Scanner;
public class NumberGuesserRunner{
    public static void main(String[] args){
        //this first 2 commands innitiate the loop that will run the game as long as the user wants to
        boolean go = true;
        while(go){
            //Creates a new number guesser and starts the game
            NumberGuesser c = new NumberGuesser();
            System.out.println("Let’s play the Number Guessing Game!");
            //says the random number for debugging
            System.out.println("DEBUG: " + c.getNumber());
            //Gives the user 3 guesses by settimg up loop
            for(int i = 1; i <= 3; i++){
                //Scanner asking for a guess
                System.out.print("Guess a number between 1 and 10: ");
                Scanner input = new Scanner(System.in);
                int guess = input.nextInt();
                //relays their guess back to them
                System.out.println("Guess # " + i + ": " + guess);
                //boolean to determine whether guess is correct
                //guess is correct
                if(c.guessValue(guess) == 0){
                    //user wins and game over
                    System.out.println("You Win!");
                    System.out.println("Game Over!");
                    break;
                }
                //guess is too high
                else if(c.guessValue(guess) == 1){
                    //if its their last guess it says you lose and tell you number
                    if(i == 3){
                        System.out.println("You Lose!");
                        System.out.println("The number was " + c.getNumber());
                    }
                    else{
                        //if not last guess it tells them their guess is too  high and asks for another guess
                        System.out.println("You guessed too high.");
                        System.out.println("Guess again!");
                    }
                }
                //guess too low
                else{
                    //if its their last guess it says you lose and tell you number
                    if(i == 3){
                        System.out.println("You Lose!");
                        System.out.println("The number was " + c.getNumber());
                    }
                    else{
                        //if not last guess it tells them their guess is too  low and asks for another guess
                        System.out.println("You guessed too low.");
                        System.out.println("Guess again!");
                    }
                }
            }
            //Asks the user if they wish to play again and uses a scanner/boolean to determine answer
            System.out.println("Would you like to play again? (y for yes/n for no): ");
            Scanner input2 = new Scanner(System.in);
            String put = input2.next();
            if(put.equals("n")){
                //fails while loop if no
                go = false;
                System.out.println("Thank you for playing");
            }
        }
    }
}