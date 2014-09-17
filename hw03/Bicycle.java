////////////////////
//Carina Felipe
//hw03-Bicycle
//Bicycle
//9-14-14
// This program will  calculate the mph and distance of a bicycle when the input (seconds and counts) is determined by a user.
//
//Bicycle.java
//
    import java.util.Scanner; //import
    
public class Bicycle {
    
    public static void main(String[] args) {
       
    Scanner myScanner;
    myScanner = new Scanner( System.in); 
       
// input data 
     int secsTrip1 = myScanner.nextInt();
     int countsTrip1 = myScanner.nextInt();
     
// output data
    double wheelDiameter = 27.0; // the diameter of wheel
    double PI = 3.14159;  // the numerical value for pi
    double feetPerMile = 5280; // the amount of feet in a mile
    double inchesPerFoot= 12;  // the amount of inches in a foot
    double secondsPerMinute = 60; // the amount of seconds in a minute
    double hour = (secsTrip1/secondsPerMinute/60); // the amount of minutes in an hour with the input value
    double distanceTripl; // distance in inches
    double distanceTrip; // distance in miles
    
    
     distanceTripl = countsTrip1*wheelDiameter*PI; //the distance in inches
     distanceTrip = distanceTripl/(inchesPerFoot*feetPerMile); // the distance in miles
     
    
// the output data printed
    System.out.println("Enter the number of seconds: " + secsTrip1);
    System.out.println("Enter the number of counts: " + countsTrip1);
    System.out.println("The trip was the distance of " + ((int)(distanceTrip*100)/100.0) + " and took " + (secsTrip1/secondsPerMinute) + " minutes");
    System.out.println("The average miles per hour was " + ((int)(distanceTrip/hour*100)/100.0)+ ".");
    }
   

}