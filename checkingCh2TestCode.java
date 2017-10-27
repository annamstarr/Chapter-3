import java.util.Scanner;

public class checkingCh2TestCode
 {
     public static void main (String[] args)
     {
         // area
         int base;
         int height;
         double area;
         int tilesneeded;
         int i = 2;
         
         Scanner scan = new Scanner(System.in);
         
         System.out.println ("Enter base: ");
         base = scan.nextInt();
         System.out.println ("Enter height:");
         height = scan.nextInt();
         
         area = (int) (base * height / 2);
         System.out.println("Area: " + area);
         
         //tiles needed
         tilesneeded = (int) (Math.ceil(area / 1.5));
         System.out.println("You need " + tilesneeded + " tiles");
         
         // checking print statements
         System.out.print("Here");
         System.out.println("There " + "Everywhere");
         System.out.println("But not" + "in Texas");
         
         System.out.println(i++);
         System.out.print(++i);
        }
    }
