package thirtydaychallenge; 
import java.util.Scanner;  //import scanner
public class DataTypes{
    
    public static void main(String[] args){
        
        //local variables
        int myInt;
        double myDouble;
        String myString;
        
        //Hackerank variables
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in); //Create an object of the scanner 
        
        //Accept int input
        myInt = scan.nextInt();
        //accept double input
        myDouble = scan.nextDouble();
        //this line stops my scan.nextLine skipping
        myString = scan.nextLine();
        //accept string input
        myString = scan.nextLine();
        
        

        /* Print the sum of both integer variables on a new line. */
            System.out.println((myInt + i));
        /* Print the sum of the double variables on a new line. */
        //do not need a leading \n as println perfroms carriage return
		System.out.printf("%.1f\n",(d + myDouble)); //use printf instead of println to control amount of decimal places used
        /* Concatenate and print the String variables on a new line; 
      
        	the 's' variable above should be printed first. */
        System.out.println(s + myString);

        
        scan.close();
        //close the scanner object as reading has finished
    }
    
}