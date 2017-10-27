// ****************************************************************
//   Stars.java
//   Author: A. Starr
//   Play a game where the user guesses a number from 1 to 10
//   Date: 10/25/17    
// ****************************************************************
public class Stars
{
    public void Main() {
        patternA();
        patternB();
        patternC();
    }
    public void patternA() {
        System.out.println();
        System.out.println("Pattern A:");
        for (int i = 10; i>0; i--) {
            printItem("*", i);
            printItem(" ", 10-i);
            System.out.println();
        }
    }
    public void patternB() {
        System.out.println();
        System.out.println("Pattern B:");
        for (int i = 9; i >=0; i--) {
            printItem(" ", i);
            printItem("*", 10-i);
            System.out.println();
        }
    }
    public void patternC() {
        System.out.println();
        System.out.println("Pattern C:");
        for (int i = 0; i <10; i++) {
            printItem(" ", i);
            printItem("*", 10-i);
            System.out.println();
        }
    }
    public void printItem(String st, int num) {
        for (int j = 0; j< num; j++){
            System.out.print(st);
        }
    }
}