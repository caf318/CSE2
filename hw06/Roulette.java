//Carina Felipe
//hw06
//Roulette
//10-13-14
//  This program is supposed to simulate a roulette game. A person is betting on 100 spins, however thusis simulation runs 1000 times
// and collects the data of the income.
//
//      javac Roulette.java
//
//      java Roulette//

      import java.util.Scanner;                           // imports scanner

public class Roulette{                                      // class

  public static void main(String[] args){                 // main method
   
   
   Scanner myScanner = new Scanner( System.in);           // allows input
   
  System.out.print(" Please enter an integer between 1 and 38: " ); //prompts the user
  
      int bet = myScanner.nextInt();                 // user input or bet
      int simulation=1;                              // simulation begins at 0
      int totalwins =0;                              // initial amount of total wins
      int lose = 0;                                  // initial amount of losses
      int reward = 0;                                // the money you will earn from winning
  
      if( bet <38 && bet > 0){
          
  while( simulation <= 1000){                         // the beginning of the 1000 repitions loop
   
      int wins = 0;                                   // intial amount of wins
      int number = (int)(Math.random()*38);           // random number
      int rolls = 1;                                  // starting amount of rolls if zero you would be playing 101 rolls
      
      
  while ( rolls <=100){                                 // while loop that states the amount of rolls should be no greater than 100
   
      if( number == bet){                               // if the bet and random number equal one another 
         totalwins++;                                   // then the amount of total wins increase by 1
         wins++;                                        // the amount of wins increase by 1
   }
   
    rolls++; }                                          // the amount of rolls increase by 1
   
    if (wins == 0){                                     // the conditon stating that if wins is equal to zero then...
     lose++;                                            // the losses add onto each other
     }
     
    else if (wins >= 1){                                // another possible answer if wins are not 0
      
      reward++;                                         // rewards continue to be added only if the are more than one wins
     }
     
     simulation++;                                      // the simulation continues to loop until it reaches 1000
   
  }                                                     // end of simulation loop
  
       System.out.println("You have won $" + reward*36);            //result
       System.out.println("You have won " + totalwins + " times");  //result
       System.out.println("You lost " + lose + " times");           //result
   
  }                                                     // end of if statement
  
    else {                                              // else statement begins
       System.out.println("You have not entered a number between 1 and 38");    // statement that prints if the number isnt in the range
   }                                                    // end of else
  
  }                                                     // end of method
  
}                                                       // end of class
  