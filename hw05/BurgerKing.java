//Carina Felipe
//hw05
//BurgerKing
//9-28-14
//
//      javac BurgerKing.java
//
//  This program will ask the user whether they want fries, a burger, or a soda. Then it will go into details on each of the orders desired.
//
//      java BurgerKing//


import java.util.Scanner;

// Define a class
public class BurgerKing{ // the class
    
// add a main method
    public static void main(String[] args) { // the method 
        
         Scanner myScanner;
        myScanner = new Scanner( System.in);
        
    System.out.print("Enter a letter to indicate a choice of  Burger (B or b) , Soda (S or s) , or Fries (F or f) : "); // first question

     String answer = myScanner.next();
     
     switch (answer){
        case "B" : System.out.println(" You ordered a burger"); { // possible response to the first question 
            
            System.out.print("Enter a letter for the choice of Cheese (C or c) , All the fixins (A or a) , or None (N or n) : "); // question in response to the answer to b/B
            
             String second = myScanner.next();
             switch (second){ 
                case "C":System.out.println(" You ordered a burger with cheese");  
                break;                                                             // answers that print when c is picked 
                case "c": System.out.println(" You ordered a burger with cheese");
                break;
                case "A":System.out.println(" You ordered a burger with all the fixins");
                break;                                                                      // answers that print when a is picked
                case "a":System.out.println(" You ordered a burger with all the fixins");
                break;
                case "N":System.out.println(" You ordered a burger with none of the above");
                break;                                                                          // answers that print when n is picked
                case "n":System.out.println(" You ordered a burger with none of the above");
                break;
             }
        }
        return;
          case "b": System.out.println(" You ordered a burger"); {  // possible response to the first question 
              
            System.out.print("Enter a letter for the choice of Cheese (C or c) , All the fixins (A or a) , or None (N or n) : "); // question in response to the answer to b/B
            
            
             String second = myScanner.next();
             switch (second){ 
                case "C":System.out.println(" You ordered a burger with cheese");
                break;                                                              // answers that print when C/c is picked 
                case "c": System.out.println(" You ordered a burger with cheese");
                break;
                case "A":System.out.println(" You ordered a burger with all the fixins");
                break;                                                                      // answers that print when A/a is picked
                case "a":System.out.println(" You ordered a burger with all the fixins");
                break;
                case "N":System.out.println(" You ordered a burger with none of the above");
                break;                                                                          // answers that print when N/n is picked
                case "n":System.out.println(" You ordered a burger with none of the above");
                break;
             }
             return;
        }
        
          case "S": System.out.println(" You ordered a Soda"); { // second option to first question
              
            System.out.print("Enter a letter indicating the type of soda you want Coke (C or c) , Pepsi (P or p) , Mountain Dew (M or m) : "); //detailed question to soda answer
            
             String second = myScanner.next();
             switch (second){ 
                case "C":System.out.println(" You ordered a Coke");
                break;                                                   // answers that print when C/c is picked 
                case "c": System.out.println(" You ordered a Coke");
                break;
                case "P":System.out.println(" You ordered a Pepsi");
                break;                                                  // answers that print when P/p is picked 
                case "p":System.out.println(" You ordered a Pepsi");
                break;
                case "M":System.out.println(" You ordered a Mountain Dew");
                break;                                                           // answers that print when M/m is picked
                case "m":System.out.println(" You ordered a Mountain Dew");
                break;
             }
        }
        return;
        
         case "s": System.out.println(" You ordered a Soda"); {  // second option to first question
              
            System.out.print("Enter a letter indicating the type of soda you want Coke (C or c) , Pepsi (P or p) , Mountain Dew (M or m) : "); //detailed question to soda answer
            
             String second = myScanner.next();
             switch (second){ 
                case "C":System.out.println(" You ordered a Coke");
                break;                                                   // answers that print when C/c is picked 
                case "c": System.out.println(" You ordered a Coke");
                break;
                case "P":System.out.println(" You ordered a Pepsi");
                break;                                                   // answers that print when P/p is picked 
                case "p":System.out.println(" You ordered a Pepsi");
                break;
                case "M":System.out.println(" You ordered a Mountain Dew");
                break;                                                           // answers that print when M/m is picked 
                case "m":System.out.println(" You ordered a Mountain Dew");
                break;
             }
        }
        return;
        
              case "F": System.out.println(" You ordered a Fries"); { // third option to first question
            
              
            System.out.print("Enter a letter indicating the type of fries you want Large (L or l) or Small (S or s) : "); //detailed question to fries answer
            
             String second = myScanner.next();
             switch (second){ 
                case "L":System.out.println(" You ordered  large fries");
                break;                                                       // answers that print when L/l is picked 
                case "l": System.out.println(" You ordered large fries");
                break;
                case "S":System.out.println(" You ordered small fries");
                break;                                                       // answers that print when S/s is picked 
                case "s":System.out.println(" You ordered small fries");
                break;
               
             }
        }
            return;
            
                case "f": System.out.println(" You ordered a Fries"); {    // third option to first question
              
            System.out.print("Enter a letter indicating the type of fries you want Large (L or l) or Small (S or s) : "); // detailed question to fries answer
            
             String second = myScanner.next();
             switch (second){ 
                case "L":System.out.println(" You ordered  large fries");
                break;                                                      // answers that is printed when L/l is picked
                case "l": System.out.println(" You ordered large fries");
                break;
                case "S":System.out.println(" You ordered small fries");
                break;                                                      // answers that prints when S/s is picked
                case "s":System.out.println(" You ordered small fries");
                break;
               
             }
        }
        return;
       
            default: System.out.println(" You did not enter any of the single characters that are supposed to be used");  // response when none of the variables that should be chosen are used
  
     
}

        
        
        
        
        
    }
}
