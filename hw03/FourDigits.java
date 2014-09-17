/////////////////////
//Carina Felipe
//hw03-FourDigits
//FourDigits
//9-14-14
// This program will allow the user to put in a double and be able to print out the first four digits to the right of the decimal point.
//
//FourDigits.java
//
    import java.util.Scanner; //import

public class FourDigits {
    
    public static void main(String[] args) {
        
    Scanner myScanner;
    myScanner = new Scanner( System.in); 
    
//input data from the user
    
    double numbersub = myScanner.nextDouble(); // user input
    double num = ((int)(numbersub*10000.0)); // the digits times 10000 
    int four = ((((int)num)%10000)); // the last four digits with only the decimal point before it
    
    
//the output data printed

    System.out.println("Enter a double and I display the four digits to the right of the decimal point: " + numbersub);
    System.out.println("The four digits are " + four); 

// input from user the second time

    double numbersub2 = myScanner.nextDouble(); // user input
    double num2 = ((int)(numbersub2*10000.0)); // the digits times 10000
    int four2 = ((((int)num2))%10000); // digits made into an integer
    double four3 = ((double)(four2)/10000); // digits turned into a double
    
    
// the output data printed
    
    System.out.println("Second sample: Enter a double and I display the four digits to the right of the decimal point: " + numbersub2);
    System.out.println("The " + "four" +  " digits " + " are " + four3);
    
    
    }
        
}