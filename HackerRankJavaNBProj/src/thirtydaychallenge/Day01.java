package thirtydaychallenge;
//import scanner
import java.util.Scanner;
public class Day01{
    
    public static void main(String[] args){
        
        //Local Variables
        String inputString; 
        
        Scanner scan = new Scanner(System.in); //creates a scanner object
        //print hello world
        System.out.println("Hello, World.");
        
        //accept input for inputString
        //Nextline accepts a whole line
        inputString = scan.nextLine();
        
        //print the contents of input string
        System.out.println(inputString);
        
        
       // Close the scanner object, because we've finished reading 
       // all of the input from stdin needed for this challenge. 
        scan.close();
    }
    
}