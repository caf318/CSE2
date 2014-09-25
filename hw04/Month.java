////////////////////
//Carina Felipe
//hw04-Month
//Month
//9-22-14
// This program will  calculate the number of days in a month that the user inputs.
//
//Month.java
//
       import java.util.Scanner; //import
    
public class Month { // class name
    
    public static void main(String[] args) { // method
       
    Scanner myScanner; // allows input
    myScanner = new Scanner( System.in); // input is assigned a variable
    
   
     
    System.out.print("Enter an int giving the number of the month (1-12) - " ); // instructs the user on what to enter
    
    int month = myScanner.nextInt(); // input is assigned the month variable
    
    if (month>12 || month<0 ) {   // If the integer is less than 0 and greater than 12, it is not a month. It cannot be used in the program
        System.out.println(" You did not enter an integer between 1 and 12 "); return;  }  // informs user that the integer is useless in program
      
    else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { //the numbers of the months that have 31 days
        System.out.println("The month has 31 days"); // the response that this month has x amount of days
          return; 
          
      } // end of else if statement
    
    else if (month == 4 || month == 6 || month == 9 || month == 11) { //the numbers of the months that have 30 days
        System.out.println("The month has 30 days"); // the response that this month has x amount of days
          return;
      } // end of else if statement
      
      
    else if (month == 2) { // if the integer is 2 it has a special process to go through
        System.out.print("Enter an int giving the year - "); } // the user must put in a year
       int year = myScanner.nextInt(); //the year must be an integer and will be defined as "year"
       
    if( year%100!=0 && year%4 == 0) { // if the year doesnt have the remainder of 0 and if it is a century with the remainder of 0 it must have the following response.
       System.out.println("The month has 29 days");} // the response that this month has x amount of days
       
    else if( year%100 == 0 && year%400 == 0) { //if the year has the remainder of 0 and if it is a century with the remainder of 0 it must have the following response.
       System.out.println("The month has 29 days"); } // the response that this month has x amount of days
       
    else 
           System.out.println("The month has 28 days");  // the response that this month has x amount of days  
       
      
      
} // end of method
      
}    // end of class
      
    
    


    