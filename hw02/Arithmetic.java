//Carina Felipe
//hw02
//Arithmetic
//9-5-14
//
//      javac Arithmetic.java
//
//      java Arithmetic//

// Define a class
public class Arithmetic{
    
// add a main method
    public static void main(String[] args) {
        
// Number of pairs of socks
    int nSocks=3;
//Cost per pair of socks
//('$' is part of the variable name)
    double sockCost=2.58;
    
// Number of drinking glasses
    int nGlasses=6;
//Cost per glass
    double glassCost=2.29;
    
// Number of boxes of envelopes
    int nEnvelopes=1;
// Cost per box of envelopes
    double envelopeCost=3.25;
    double taxPercent=0.06;
    
//Total cost of each item without tax
     double totalSockcost =nSocks*sockCost;
     double totalGlasscost=nGlasses*glassCost;
     double totalEnvelopecost=nEnvelopes*envelopeCost;

//Total cost of each item with tax
     double totalSockcosttax=totalSockcost*taxPercent+totalSockcost;
     double totalGlasscosttax=totalGlasscost*taxPercent+totalGlasscost;
     double totalEnvelopecosttax=totalEnvelopecost*taxPercent+totalEnvelopecost;
    
// Total cost of purchases before tax
     double totalcostofpurchase=totalSockcost+totalGlasscost+totalEnvelopecost;

// Total cost of purchases with tax
     double totalcostofpurchasewithtax=totalSockcosttax+totalGlasscosttax+totalEnvelopecost;
     
//  Amount of money spent on purchasing all the items with and without tax

    System.out.println("The total cost of all the items including tax is $" + (totalcostofpurchase) + ".");
    System.out.println("The total cost of all the items without tax is $" + (int)(totalcostofpurchasewithtax*100)/100.0 + ".");
    
// Amount of money spent on each item with and without tax
    System.out.println("The cost of socks is $" + (int)(totalSockcosttax*100)/100.0 + " and without tax it is $" + 
    (totalSockcost) + ".");
    System.out.println("The cost of drinking glasses is $" + (int)(totalGlasscosttax*100)/100.0 + " and without tax it is $" + 
    (totalGlasscost) + ".");
    System.out.println("The cost of the envelopes is $" + (int)(totalEnvelopecosttax*100)/100.0 + " and without tax it is $" +
     (totalEnvelopecost) + ".");
     
     
    }
}