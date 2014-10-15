//Carina Felipe
//hw06
//Roulette
//10-13-14
//
//      javac Roulette.java
//
//      java Roulette//

      

public class Roulette{                                      // class

  public static void main(String[] args){                 // main method
   
   

       int simulation=0;                              // simulation begins at 0
   
  while( simulation <= 1000){                         // the beginning of the 1000 repitions loop
   
      int wins = 0;                                   // intial amount of wins
      int totalwins =0;                                // initial amount of total wins
      int lose = 0;                                   // initial amount of losses
      int number = (int)(Math.random()*38);           // random number
      int bet = (int)(Math.random()*38);              // the bet
      int rolls = 1;                                 // starting amount of rolls if zero you would be playing 101 rolls
      
      
   while ( rolls <=100){                             // limits the amount of rolls taken
   
   if( number == bet){                               // if the bet is equal to random the
    wins++;                                            // a win is counted and added
    totalwins++;                                      // total wins is counted 
   }
   
   rolls++; }                                       // end of loop and end of roll
   
    if (wins == 0){                                 // now focus on wins, if wins is 0 then loses are added
     lose++;
     System.out.println("You lost money and the bet"); 
     }
     
    else if (wins >= 3){                              // if you win once or more than once then...
     int reward = 36*wins;                           // the money you will earn from winning will be calculated
      reward++;                                        // reward is added up 
     System.out.println("You have won $" + reward);                 // results
      System.out.println("You have won " + totalwins + " times");      // results
     
     }
     
     simulation++; // the simulation continues to loop until it reaches 1000
   
  } // end of simulation loop
  
  } // end of method
  
} // end of class
  

  
  
