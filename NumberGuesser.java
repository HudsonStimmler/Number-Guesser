/**
 * 
 * 
 * @version 10-17-2021
 * @author Hudson Stimmler
 */

public class NumberGuesser {
    //fields
    //keeps track of the only value being tracked which is the random number being generated
    private int RandomNumber;

    //constuctor(s)
    //the constructor starts a new game by default
    public NumberGuesser(){
        //this calls the method that starts a game
        startNewGame();
    }

    //methods
    //method that starts the game
    public void startNewGame(){
        //Starts the game by making a variable a random int between 0 and 1 but then multiplies by 10 and adds by 1 to make between 1 and 10 but only whole number
        int R = (int)(Math.random() * 10 + 1);
        RandomNumber = R;
    }
    //this is the method that decides whether the guess was right or wrong
    public int guessValue(int guess){
        //if the guess equals the RandomNumber, it returns 0
        if(guess == RandomNumber){
            return 0;
        }
        //if the guess is bigger than the RandomNumber, it returns 1
        else if(guess > RandomNumber){
            return 1;
        }
         //if the guess is smaller than the RandomNumber, it returns -1
        else{
            return -1;
        }
    }
    //gives the number for debugging
    public int getNumber(){
        return RandomNumber;
    }
}