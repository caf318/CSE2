//Carina Felipe
//HW08
//HW08
//10-28-14
//   This program has the objective of giving you practice in writing methods, overloading methods, and in forcing the user to enter good input.  
//



import java.util.Scanner;  //import 
 
public class HW08{      // class
//////////////////////////////////////////////////////////////////////    

    public static String getInput1( Scanner scan, String a){        // first method
        String scann = scan.next();                                 // user input
        
        if (scann.length() != 1 || scann.charAt(0) != 'c' && scann.charAt(0) != 'C'){       // if statement for the characters 'c' and 'C' and limits the characters in answer
        System.out.println("You did not enter a character from the list 'Cc'; try again");  // printed if wrong
        scann = scan.next();                                                                // resubmit answer
        }
        
        if(scann.charAt(0) != 'c' && scann.charAt(0) != 'C'){                               // checks if the answer has C
        System.out.println("You did not enter a character from the list 'Cc'; try again");  // wrong answer
        scann = scan.next();                                                                // resubmit answer
        }
         
        else{                                                                               //else
        return scann;}                                                                      // outputs the answer else
  return scann; }                                                                            // outputs the answer from method
 /////////////////////////////////////////////////////////////////////
 
        public static String getInput2(Scanner scan1){              // second method
            String scan2 = scan1.next();                            // user input
            
          for(int x = 1; x < 5; x++ ){
              if(scan2.charAt(0) != 'Y' && scan2.charAt(0) != 'y' && scan2.charAt(0) != 'N' && scan2.charAt(0) != 'n'){
            System.out.println("You did not enter a character from the list 'yYnN'; try again");        // printed if wrong
                scan2 = scan1.next();  }                                                               // try again
          
          else{ 
              return scan2; }                                                                          // outputs the answer from else
          }   
          System.out.println("You failed 5 times since");                                              // printed if wrong
        return scan2;}                                                                                 // outputs the answer from method
        
////////////////////////////////////////////////////////////


 public static String getInput3(Scanner scan3, String c){ // third method
 String scan4 = scan3.next();                             // user input
  c = "0123456789";
 
  if ( scan4.length() != 1 ){                                                                        // limits the characters in answer
   System.out.println("You entered too many characters");                                            // printed if wrong
   System.out.println("Choose a digit");                                                             // printed if wrong
   scan4 = scan3.next();
 }
 
 else{ 
    System.out.println("You did not enter an acceptable character");                                 // printed if wrong
     System.out.println("Choose a digit");                                                           // printed if wrong
      scan4 = scan3.next();                                                                          // retry
 }

 if( (scan4.charAt(0) == c.charAt(0)) || (scan4.charAt(0) == c.charAt(1)) || (scan4.charAt(0) == c.charAt(2)) || (scan4.charAt(0) == c.charAt(3)) // test if the input is good 
 || (scan4.charAt(0) == c.charAt(4)) || (scan4.charAt(0) == c.charAt(5)) || (scan4.charAt(0) == c.charAt(6)) || (scan4.charAt(0) == c.charAt(7))
 || (scan4.charAt(0) == c.charAt(8)) || (scan4.charAt(0) == c.charAt(9)) || (scan4.charAt(0) == c.charAt(10)) ){
     return scan4;
 }

 
 return scan4; }   // end of method and uses this answer in main method
 
//////////////////////////////////////////////////////////////////////////

  public static void main(String []arg){ // main method
      
	String input; // initialized the first input
	
	Scanner scan=new Scanner(System.in); // declare and initialize scanner 1
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); // prompt user
	
	input=getInput1(scan,"Cc"); // method is called
	
	System.out.println("You entered '"+input+"'"); // printed response to user for first method


//////////////////////////////////////////////////////////////////

System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); // prompt user
    String input2; // initialized the second input

    Scanner scan1=new Scanner(System.in);  // declare and initialize scanner 2
    
     input2 = getInput2(scan1); //give up after 5 attempts and method is called
	
	if(input!=" "){  // if input is not a space then print the next statement out
	    
  	System.out.println("You entered '"+input2+"'"); // printed response to user for second method
   	
	}

////////////////////////////////////////////////////////////////////

	String input3; // initialized the third input
	
	Scanner scan3=new Scanner(System.in); // declare and initialize scanner 3
	
    System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':"); // prompt user
    
input3=getInput3(scan3,"0123456789"); // method is called

	System.out.println("You entered '"+input3+"'"); // printed response to user for third method



  }  // end of method 
  
} //end of class