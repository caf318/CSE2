////////////////////
//Carina Felipe
//hw04-IncomeTax
//IncomeTax
//9-22-14
// This program will  calculate the integer the user gives into thousand dollars of income and then give the amount of tax on the given income
//
//IncomeTax.java
//
       import java.util.Scanner; //import
    
public class IncomeTax { // class 
    
    public static void main(String[] args) { //method
       
    Scanner myScanner; // allows input
    myScanner = new Scanner( System.in); //defines input
    
    System.out.print( //lets the user know what to input
          "Enter an integer giving the number of thousands: ");
          
    if(myScanner.hasNextInt()) { // if statement is beginning for input
          int income = myScanner.nextInt(); // defines the input
       int thousands= income*1000; // defines thousands
     
       
       if( income <= 0) { // what the program prints if integer isnt positive
       System.out.println("You did not enter a positive integer"); } 
       
       
    else { // if the program is positive then the following can occur
        if( income < 20){  //if income is less that 20, then the statement below will print
          System.out.println("The tax rate on $" + thousands + " is 5.0%" + "," + " and the tax is $" + (thousands*.005)*10);} //
          if( income >=20 && income <40 ){ //if income is true to the if expression, then the statement below will print
          System.out.println("The tax rate on $" + thousands + " is 7.0%" + "," + " and the tax is $" + (thousands*.007)*10);}
          if( income >=40 && income <78){ //if income is true to the if expression, then the statement below will print
          System.out.println("The tax rate on $" + thousands + " is 12.0%" + "," + " and the tax is $" + (thousands*.12));}
          if( income >= 78){ //if income is true to the if expression, then the statement below will print
          System.out.println("The tax rate on $" + thousands + " is 14.0%" + "," + " and the tax is $" + (int)(thousands*.14)/100*100);}

   System.out.println("."); // what will print out at the end of the else expression
    } // end of else
    
    }// end of if statement
    
    else {   // What occurs when the input is not an integer
        System.out.println("You did not enter an integer");} 
        
    } // end of method
} // end of class