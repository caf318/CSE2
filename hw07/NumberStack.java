//Carina Felipe
//hw07
//NumberStack
//10-17-14
//                 This program uses the for, while, and do-while loop methods to create a number stack.      
//

import java.util.Scanner;                                                             // allows user input

public class NumberStack{                                                             // the class

  public static void main(String [] args){                                            // the method 
      

    Scanner myScanner;                                                                //declaring scanner as variable 
    
    myScanner = new Scanner ( System.in );                                            //statement calling the scanner constructor
    
    System.out.println("Please enter a number between 1 and 9.");
    int mynumber = myScanner.nextInt();                                               //prompting user to enter their number
    
  
      if ( mynumber < 1 || mynumber > 9){                                             // the range that the number should be in
          System.out.println(" This number is not within the range.");                // printed if number isnt in the range
      }
    
    else {
         
         for(int b = 1; b<=mynumber; b++ ){                //outer big loop
         
             for(int c=0;c<b;c++){                         // 2nd outer loop
             
             for(int space= mynumber-b; space>0; space--){ // math to find the number of spaces
                 System.out.print(' ');                    // space in printed if the condition is true
             }                                             // end of space loop
             for( int row=(2*b)-1; row>0;row--){           // start of row loop and math to find row
                 System.out.print(b);                      // number is printed repeatedly in the row
             }                                             // end of row loop
            System.out.println();                           
             }                                             // end of 2nd out loop
             for(int space2= mynumber-b; space2>0; space2--){       // the space2 loop begins and is for spaces for the dashes
                 System.out.print(' ');                             // space is printed out
             }                                                      // end of space2 loop
             for( int ndash=(2*b)-1; ndash>0;ndash--){              // start of dash loop
                 System.out.print("-");                             // dash is printed
             }                                                      // end of dash loop
              System.out.println();                                 
      }                                                             //end of out big loop
    
 
 System.out.println("That was an example of a For Loop");

   
  int b = 1;                                                // b is initialized
  
    while( b<=mynumber)                                     // the b loop condition is set
    {                                                       //outer big loop begins
     int c = 0;                                             // c is initialized
     
        while( c<b){                                        // second outer big loop
        
        int space= mynumber-b;                              // space is initialized
        
            while( space>0){                                // start of space loop
                System.out.print(' ');
                space--;
            }                                               //end of space loop
            int row = (2*b)-1;                              // row is initialized
            
            while (row >0){                                 // start of row loop
              System.out.print(b);
              row--;
            }                                               // end of row loop
            
          System.out.println();
          c++;                                              // c increases by 1                                        
            
        }                                                   // end of second outer big loop
        int space2 =mynumber-b;                             // space2 is initialized
        
        while( space2>0){                                   // space2 loop begins                             
            System.out.print(' ');                          // print out space
            space2--;                                        // space 2 decreases by 1
        }                                                    // end of space2 loop
        
        int ndash= (2*b)-1;                                  // ndash is initialized
        
         while( ndash>0){                                    // while loop begins
            System.out.print("-");                           // print out the dash
          ndash--;                                           // decreases by 1
        }                                                    // end of dash loop
    
      System.out.println();                                 
         b++;                                                // b increases by 1
         
    } // end of big outer loop

  System.out.println("That was an example of a While Loop");

        
    b = 1;
    
     do{                          // do statement for b begins
    
    int c = 0;                  // c initialized
    
     do{                        // c do statement begins
          
    int space= mynumber-b;      // space initialized
    
     do{ System.out.print(' '); // space prints out
                space--;}       // space decreases by 1
                
        while( space>0);        // while statement for space
     
    int row = (2*b)-1;             // row is initialized
    
     do{  System.out.print(b);     // do statement for b
              row--;}              // row decreases by 1
              
        while (row >0);            // while statement for row 
     
     System.out.println();
          c++;}                     // c increases by 1
         
        while ( c<b);              // while statement for c
          
    int space2 =mynumber-b;        // initialized space2
    
     do{System.out.print(' ');     // space prints out
            space2--;}             // space2 decreases by 1
            
        while( space2>0);          // while statement for space2
    
    int ndash= (2*b)-1;            // ndash is initialized
    
     do { System.out.print("-");   // ndash do statement
            ndash--;}              // ndash decreases by 1
            
        while( ndash>0);           //while statement for ndash
    
     System.out.println();         
         b++;}                     // b increases by 1 and do statement for b ends
         
        while( b<=mynumber);       // while for b

System.out.println("That was an example of a Do- While Loop");
     
        
         } // end of else statement
    
      
    
        
        
} //end main
    
} //end  class