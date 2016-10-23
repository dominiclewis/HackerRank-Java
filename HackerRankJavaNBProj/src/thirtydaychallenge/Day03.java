package thirtydaychallenge;
import java.util.Scanner;
public class Day03{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        //Close scanner object
        scan.close();
        
        
    
        if ( ( ( n % 2) != 0 ) || ( ( (n % 2) == 0 ) && (n >= 6 ) && (n <= 20) ) ) { //if the remainer of the number when divided by 2 is not zero then the number is odd 
            //OR if the remainer when divided by two is 0 then the number is even also the number must be between 6 and 20
            System.out.println("Weird");
        }
       
        //If the remainder of n when divided by 2 is zero(even) and n is between 2 and 5 inclusive 
        else if ( ( (n % 2) == 0) && ( (n >= 2) && (n <= 5 ) ) ) {
            
            System.out.println("Not Weird");
            
        }
       
        //if the remaineder of n when divided by 2 is zero(even) and the number is larger than 20
        else if ( ( (n % 2) == 0) && (n > 20 )){
            System.out.println("Not Weird");    
        }
        
        
     
        
    }

   
}
