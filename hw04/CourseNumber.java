////////////////////
//Carina Felipe
//hw04-CourseNumber
//CourseNumber
//9-23-14
// This program will  give the user the year and semester that the number they submitted is equal to.
//
//CourseNumber.java
//
       import java.util.Scanner; //import
    
public class CourseNumber { // class
    
    public static void main(String[] args) { // method
       
    Scanner myScanner; // allows input
    myScanner = new Scanner( System.in); // input is assigned a variable
    
    System.out.print("Enter a six digit number giving the course semester- "); // tells the user what to type in

    
  if (myScanner.hasNextInt()){ // if statement begins for the various course options
      int course=myScanner.nextInt(); // input is assigned a variable
      int semester = course-(course/100)*100; // variable for the semesters is assigned
    
      int year = course/100; // equation  for a year is defined and assigned a variable 
      
  if( course < 186510 || course > 201440) { // sets the range of which the courses fall in
       System.out.print(" The number was outside the range [186510,201440]");}  // rejects the integers if not in range
     
  else { 
      if(semester==10){ // if the semester falls on this  number the the statement below is printed
       System.out.print("This course was offered in the Spring semester ");}
       
      if(semester==20) // if the semester falls on this  number the the statement below is printed
       System.out.print("This course was offered in the Summer semester 1 ");
       
      if(semester==30) // if the semester falls on this  number the the statement below is printed
       System.out.print("This course was offered in the Summer semester 2 ");
       
      if(semester==40) // if the semester falls on this  number the the statement below is printed
       System.out.print("This course was offered in the Fall semester ");
        
      if(semester !=10 && semester != 20 && semester != 30 && semester != 40) {// if the semesters arent any of the numbers then the statement below is printed
        System.out.print("This is not a legitimate semester in the year "); }
        
        System.out.print( " of " + year);}  
        }//prints out at the end of else statement
        
     } // end of method
    
  
        
      } //end of class
         
            
     
   
    

