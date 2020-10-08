/**
* Joshua Pardhe 1214553301
* CSE360 - Professor Gonzales-Sanchez
* This is the second version of the program with updated functions and variables.
* This program can add and subtract, and return the current value.
* It can also return a ticker tape of total calculations performed.
* Finally, you can call the clear() function to clear the current sum and the tape.
*/


package cse360assignment02;

public class AddingMachine {
  private int total;
  private String calcHistory = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  calcHistory += " + " + value;
  }

  public void subtract (int value) {
	  total = total - value;
	  calcHistory += " - " + value;
  }

  public String toString () {
    return calcHistory;
  }

  public void clear() {
	  total = 0;
	  calcHistory = "0";
  }
  
//  public static void main(String[] args) {
//	  AddingMachine myCalculator = new AddingMachine();
//	  myCalculator.add (4); 
//	  myCalculator.subtract (2); 
//	  myCalculator.add(5);
//	  System.out.println(myCalculator.getTotal());
//	  System.out.println(myCalculator.toString());
//	  myCalculator.clear();
//	  System.out.println(myCalculator.getTotal());
//	  System.out.println(myCalculator.toString());
//  }
  
}