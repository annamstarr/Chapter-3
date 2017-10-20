// ****************************************************************
//   Guess.java
//   Auhor: A. Starr
//   Play a game where the user guesses a number from 1 to 10
//   Date: 10/20/17
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(10) +1;
          //print message asking user to enter a guess
          System.out.println ("Guess a number between 1 and 10: ");
          guess = scan.nextInt();
          //read in guess
          
          while (guess != numToGuess)  //keep going as long as the guess is wrong
            {
               System.out.println("That's not it, keep guessing: "); //print message saying guess is wrong
               guess = scan.nextInt(); //get another guess from the user
          }
 
          System.out.println("You're right, the nuber was " + numToGuess + "!"); //print message saying guess is right
        }
}