////////////////////
//Carina Felipe
//hw03-Root
//Root
//9-15-14
// This program will allow a person to enter a number and then find the cube root of the number.
//
//Root.java
//
    import java.util.Scanner; //import

public class Root {
    
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner( System.in);
        
// input data
    double x = myScanner.nextDouble();
    
// the estimates that are made are plugged into the following equations
    double guess = (x/3); // first estimate
    double secondguess = (guess*guess*guess+x)/(3*guess*guess);  // second estimate with previous guess substituted in
    double thirdguess = (2*secondguess*secondguess*secondguess+x)/(3*secondguess*secondguess); // third estimate using the previous answer
    double fourthguess = (3*thirdguess*thirdguess*thirdguess+x)/(4*thirdguess*thirdguess); // fourth estimate using the previous answer
    double fifthguess = (4*fourthguess*fourthguess*fourthguess+x)/(5*fourthguess*fourthguess); // last estimate
    
// results from all the estimates

    System.out.println("Enter a double and I print its cube root- " + (int)(x));
    System.out.println("The cube root is " + fifthguess + ": " + fifthguess + "*" + fifthguess + "*" + fifthguess + "=" + fifthguess*fifthguess*fifthguess + ".");
    
    
    }
}