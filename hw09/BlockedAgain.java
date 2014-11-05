//Carina Felipe
//
//BlockedAgain
//10-31-14
//   This program has the objective of  
//



import java.util.Scanner;

public class BlockedAgain{
    
  public static int checkInt( ){ 
      
      if( getInt() > 1 && getInt() <9){
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
    
    
      if(scan.hasNextInt()){
      return checkRange(b);  
      } 
      else{
          System.out.println(" ");
      }
       
    return b;
    }
    
    public static int checkRange( int x){  //method for checking the range
        
        if (x>0 && x<9){
            return x;
        }
        else{
          System.out.println("Try Again, the input did not satisfy the requirements because it was not a positive or an integer "); 
        }
      return x; 
    }
//////////////////////////////////////////////////////////////    
        public static void allBlocks(int m){
        
        for( int j=0; j<m; j++){
            
            block(j,m);
         dashline(j,m);
          System.out.println();
}

    }
    
     public static void block( int j, int m){
         
         for(int c=0; c<j; c++){
             
             
	    line(j,m);
	   
     	 System.out.println();
        
    }
     }
     
      public static void line(int j,int m){
    
    for (int s= m-j; s>0; s--){
    System.out.print(" ");
    } 
   
 	for(int row= (j*2)-1; row>0; row-- ){
	    System.out.print(j);
    }

     
      }
      
    public static void dashline(int j,int m){
            	for (int ss=m-j; ss>0; ss--){
   System.out.print(" ");
	    
	}
         for( int ndash=(2*j)-1; ndash>0;ndash--){          
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