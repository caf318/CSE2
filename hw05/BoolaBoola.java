//Carina Felipe
//hw05
//BoolaBoola
//9-28-14
//
//      javac BoolaBoola.java
//
//      java BoolaBoola//


import java.util.Scanner;       // input method
import java.util.Random;        // random method

// Define a class
public class BoolaBoola {       // class
    
// add a main method
    public static void main(String[] args) {        // main method
        
         Scanner myScanner;
        myScanner = new Scanner( System.in); 

    
    boolean option;         
    boolean option2;
    
    Random random = new Random();                   // random method used in body
    
    boolean word1= random.nextBoolean();            // terms true and false in boolean form
    boolean word2= random.nextBoolean();            // terms true and false in boolean form
    boolean word3= random.nextBoolean();            // terms true and false in boolean form
    
    boolean input = random.nextBoolean();           // first input value as a boolean, will be used for comparision later
    
    boolean symbol1 = random.nextBoolean();         // operator  && or || as boolean
    boolean symbol2 = random.nextBoolean();         // operator  && or || as boolean
     
    String input2 = String.valueOf(input);          // first input value being changed to a string
    
    String op1 = String.valueOf(symbol1);           // operator  && or || that was a  boolean, turned into a string
    String op2 = String.valueOf(symbol2);            // operator  && or || that was a  boolean, turned into a string
    
    String and = "&&";          // assigned operators 
    String or = "||";            // assigned operators 
    
    if (op1 != op2){            // if operator one is the not equal to operator two then the values will  be opposites. At one point they may turn out to be the same operators in the question
        op1= and;}
        
        else{                    // if operator two is equal to one then a || will result
        op1=or;}
    
    
    if (op2 != op1){            // if operator one is the not equal to operator two then the values will  be opposites. At one point they may turn out to be the same operators in the question
        op2= or;}
        
        else{                   // if operator two is equal to one then a && will result
            op2=and; }
 
    
         System.out.print("Does " + word1 + " " + op1 + " "  + word2 + " " + op2 + " " + word3  +" have the value true (t/T) or false (f/F)?");  // question that the user will be asked
    
     
      String input3 = myScanner.next();         // user input in form of Ff or Tt
      String ff = "F";                          // assigned variables 
      String fff = "f";
      String tt = "T";
      String ttt = "t";
      
    if (input2.equals("false")){        // if input2 is equal to false then the answer will be F or f
         input2 = ff ; }
     
        else{                              // if input2 is not equal to false then the answer will be T or t
         input2 = tt; }
  
    
     if ( input3 == ff ){               // if the user's input is equal input2 then the equation is correct.
          System.out.println("Correct"); }
          
        else{                     // if the user's input is not equal input2 then the equation is not correct.
              System.out.println("Wrong; Try Again"); }
   
    
      

    } // end of method
    
} // end of class