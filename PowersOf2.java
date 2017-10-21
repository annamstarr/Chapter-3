// ****************************************************************
//   PowersOf2.java
//   Author: A. Starr
//   Print out as many powers of 2 as the user requests
//   Date: 10/21/17
// ****************************************************************
import java.util.Scanner;

public class PowersOf2
{
    public static void main(String[] args) {
        int numPowersOf2;            //How many powers of 2 to compute
        int nextPowerOf2 = 1;        //Current power of  2
        int n = 1;
        int exponent = 0;            //Exponent for current power of 2 & serves as a counter for the loop    
                                         
        Scanner scan = new Scanner(System.in);

        System.out.print("How many powers of 2 would you like printed?\t");
        numPowersOf2 = scan.nextInt();
        
        //print a message saying how many powers of 2 will be printed
        System.out.println ("The first " + numPowersOf2 + " powers of 2:"); 
        while (exponent <= numPowersOf2){
                //print out current power of 2
                System.out.println("2^" + (exponent) + " = " + nextPowerOf2);
                
                //find next power of 2 -- how do you get this from the last one?
                n = nextPowerOf2;
                nextPowerOf2 = (2 * n);
                
                //increment exponent
                exponent++;
            }
    }
}