////////////////////
//Carina Felipe
//hw04-TimePadding
//TimePadding
//9-24-14
// This program will  allows a user to input an integer and then it will calculate time (in conventional form) that the integer is equal to
//
//TimePadding.java
//
       import java.util.Scanner; //import
    
public class TimePadding { // class name
    
    public static void main(String[] args) { // method
       
    Scanner myScanner; // allows the program to accept input
    myScanner = new Scanner( System.in); // assigns the input a variable
    
    System.out.print("Enter the time in seconds: ");  // alert user to put in value
     
    if( myScanner.hasNextInt()) {   // check to see if value inputted is an integer
         int time = myScanner.nextInt(); // define what the inputted value is equal to in program
         int hour = time/3600; // equation for how many hours are in the value inputted by user
         int sec = (time-(hour*3600)); // equation to find the amount of seconds left over from the hours being calculated
         int min = sec/60;  // how many minutes are in the seconds  
         int secs = sec-min*60; // the equation to find how many seconds are left over 
        
         
    if(  min < 10 && secs <10){   // allows padded zeros to appear on conventional form of time 
        System.out.println("The time is " + hour + ":" +"0" + min + ":" + "0" + secs);} // conventional time displayed with padded zeros
             
      
     
    else // if the number for the minutes and seconds value is not less than 10
        System.out.println("The time is " + hour + ":" + min + ":" + secs + "."); // conventional time without padded zeros
         
     }// end of if statement
     

      
     
     }// end of method
     }// end of class

    