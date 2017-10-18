// ****************************************************************
//   Rock.java
//   Author: A. Starr
//   Date: 10/18/17
//   Play Rock, Paper, Scissors with the user      
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine computer's play
        
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Enter your play (r, p, s): ");   //Get player's play
        personPlay = scan.next(); 
        personPlay = personPlay.toUpperCase();              //Make player's play uppercase for ease of comparison
        computerInt = generator.nextInt(3);                 //Generate computer's play (0,1,2)
        //Translate computer's randomly generated play to string
        if (computerInt == 0) {
            computerPlay = "R";
        }
        else if (computerInt == 1) {
            computerPlay = "P";
        }
        else{
            computerPlay = "S";
        }
        System.out.println ("Computer's Play: " + computerPlay);    //Print computer's play
        //See who won.
        if (computerPlay.equals ("R") && personPlay.equals ("R")) {
            System.out.print ("It's A Tie!");
        }
        if (computerPlay.equals ("R") && personPlay.equals ("P")) {
            System.out.print ("Paper covers Rock, you win!");
        }
        if (computerPlay.equals ("R") && personPlay.equals ("S")) {
            System.out.print ("Rock crushes Scissors, you lose!");
        }
        if (computerPlay.equals ("P") && personPlay.equals ("R")) {
            System.out.print ("Paper covers Rock, you lose!");
        }
        if (computerPlay.equals ("P") && personPlay.equals ("P")) {
            System.out.print ("It's A Tie!");
        }
        if (computerPlay.equals ("P") && personPlay.equals ("S")) {
            System.out.print ("Scissors cuts paper, you win!");
        }
        if (computerPlay.equals ("S") && personPlay.equals ("R")) {
            System.out.print ("Rock crushes Scissors, you win!");
        }
        if (computerPlay.equals ("S") && personPlay.equals ("P")) {
            System.out.print ("Scissors cuts paper, you lose!");
        }
        if (computerPlay.equals ("S") && personPlay.equals ("S")) {
            System.out.print ("It's A Tie!");
        }
        
    }
}