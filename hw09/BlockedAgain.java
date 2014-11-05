//Carina Felipe
//
//BlockedAgain
//10-31-14
//   This program has the objective of  is to create a numberstack by only using nested methods
//



import java.util.Scanner;

public class BlockedAgain{
    
  public static int checkInt( ){   // method that prints out final number
      
      if( getInt() > 1 && getInt() <9){  //check if the number is positive
          return getInt();
      }
      
      else{
        System.out.println("Try Again");   
      }
      
      return getInt();
      }
    
  public static int getInt( ){ // method for checking if value is an integer (it contains the checkRange method)
        
      Scanner scan=new Scanner(System.in);
    
       int b= scan.nextInt();
    
    
      if(scan.hasNextInt()){   //test if user input is an integer
      return checkRange(b);  
      } 
      else{
          System.out.println(" ");
      }
       
      return b;
    }
    
    public static int checkRange( int x){  //method for checking the range
        
        if (x>0 && x<9){  // test if in range
            return x;
        }
        else{
          System.out.println("Try Again, the input did not satisfy the requirements because it was not a positive or an integer "); 
        }
        return x; 
    }
//////////////////////////////////////////////////////////////    
        public static void allBlocks(int m){ //method used to create number stacks
        
        for( int j=0; j<m; j++){  // first outer loop
            
            block(j,m); //these variables are used in block method
         dashline(j,m); //these variables are used in line method
          System.out.println();
    }

    }
    
     public static void block( int j, int m){ //method to create blocks
         
         for(int c=0; c<j; c++){ // second outer loop
             
             
	    line(j,m);   // these variables are used in line method
	   
     	 System.out.println();
        
    }
    }
     
      public static void line(int j,int m){ // method to create spaces and rows
    
    for (int s= m-j; s>0; s--){    //space loop
    System.out.print(" ");
    } 
   
 	for(int row= (j*2)-1; row>0; row-- ){  // row loop
	    System.out.print(j);
    }

     
    }
      
    public static void dashline(int j,int m){  //method to create dashes
        
	for (int ss=m-j; ss>0; ss--){  // space loop for dashes
   System.out.print(" ");
	    
	}
         for( int ndash=(2*j)-1; ndash>0;ndash--){    // dash loop       
         System.out.print("-"); 
    }

    }
   
      
    
public static void main(String []s){  
    
int m;
//force user to enter int in range 1-9, inclusive.

m = getInt();

allBlocks(m);
 
 System.out.println(m);




 } // end of main method
} // end of class