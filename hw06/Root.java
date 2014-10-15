//Carina Felipe
//hw06
//Root
//10-13-14
//                 This program uses the bisection method  to find the square root of a number that the user inputs.
//
//      javac Root.java
//
//      java Root//

import java.util.Scanner;

public class Root{    

  public static void main(String [] args){       

    
    Scanner b;
    b =new Scanner(System.in);
 
      System.out.println("Please enter an integer: ");     //prompts user
    
    int x = b.nextInt();                                   // declaration of user input
    
    if( x < 0){                                            // if input is below 0 then the program restarts
            return;                                        // restart
    }                                                      // end of if
    
   else{                                                   // beggining of else statement
     
    double low = 0;                                        // low is declared 
    double high = 1 + x;                                   // high is declared
    double middle = ((high + low)/2.00);                   // find the middle of the two terms
  
   while ( high-low > .0000001*(1+x) ){                    //while loop begins
    
    if ( middle * middle > x){                             // if middle squared is greater than zero then high becomes middle
     
    high = middle;                                         // high becomes middle
    }
     else {                                                // start of else
         low = middle;                                     // low becomes middle
     }                                                     //  end of else
  
    
   middle = ((high + low)/2.00);                           // since high and low becom middle you must repeat the process
   
    
   }                                                       // end of while loop
    
       
     System.out.println( "The root is " + middle);         // the output
    
       }                                                   // end of else
    }                                                      // end of method
  }                                                        // end of class

    
    