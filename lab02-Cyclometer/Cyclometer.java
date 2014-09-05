//Carina Felipe
//lab02-Cyclometer
//Cyclometer
//9-3-14
// This program will help record data, time elapsed in seconds, and the number of rotations
// 
// Cyclometer.java
//
//  define a class
public class Cyclometer{
     // add main method
     public static void main(String[] args) {
 
//our input data
    int secsTrip1=480;  // the amount of seconds in the first trip
    int secsTrip2=3220;  // the amount of seconds in the second trip
    int countsTrip1=1561;    // the amount of counts in the first trip
    int countsTrip2=9037;   // the amount of counts in the second trip
 
// our intermediate variables and output data
    double wheelDiameter=27.0;   //  the diameter of the front wheel
    double PI=3.14159;  // the numerical value for the mathematical term pi
    double feetPerMile=5280;  // the amount of feet in a mile
    double inchesPerFoot=12;   // the amount of inches in  foot
    double secondsPerMinute=60;   // the amount of seconds in a minute 
    double distanceTripl, distanceTrip2, totalDistance; // the distance traveled for each trip and the trips combined

// The numbers from variables which were previously put in

    System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
    System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
    
        //run the calculations; store the values. Document your 
        //calculation here. What are you calculating?
        //
        //
    distanceTripl=countsTrip1*wheelDiameter*PI;
//above gives the distance in inches
//(for each count, a rotation of the wheel travels
 //the diameter in inches time PI)
    distanceTripl/=inchesPerFoot*feetPerMile; // converts to distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTripl+distanceTrip2; // the distance of trip 1 and trip 2 added together
 
    //print out the output data.
    System.out.println("Trip 1 was "+(distanceTripl) + " miles");
    System.out.println("Trip 2 was "+(distanceTrip2) + " miles");
    System.out.println("The total distance was "+( totalDistance ) +" miles");

 
} // end of main method 
 } // end of class
