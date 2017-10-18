// ***************************************************************
//   Salary.java
//   A. Starr
//   10/18/17
//   Computes the amount of a raise and the new salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent", "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
   public static void main (String[] args)
   {
           double previousBalance;
           double additionalCharges;
           double newBalance;
           double interest;
           double minimumPayment;
 
           Scanner scan = new Scanner(System.in);
           
           System.out.println("CS CARD International Statement");
           System.out.println("===============================");
           System.out.println();
           System.out.print("Previous Balance:     $");
           previousBalance = scan.nextDouble();
           System.out.print("Additional Charges:   $");
           additionalCharges = scan.nextDouble();
           
           if (previousBalance == 0) {
               interest= 0;
            }
           else{
               interest = (0.02 * (previousBalance + additionalCharges));
            }
           System.out.println("Interest:             $" + interest);
 
           newBalance = previousBalance + additionalCharges + interest;
           minimumPayment = (0.20 * newBalance);
           
           System.out.println();
           System.out.println("New Balance:          $" + newBalance);
           System.out.println();
           System.out.println("Minimum Payment:      $" + minimumPayment);
        }
}