//***************************
// Author: A. Starr
// Date: 10/25/17
// Design and implement an application that produces a multiplication table, 
        //showing the results of multiplying the integers 1-12 by themselves
//******************************

public class MultiplicationTable {
    public void Main(){
        for (int i = 1; i <=12; i++) {
            printRow(" ", i);
            System.out.println();
        }
    }
    public void printRow(String st, int num) {
        for (int j = 1; j<=12; j++){
            System.out.print(num * j + "\t");
        }
    }
}