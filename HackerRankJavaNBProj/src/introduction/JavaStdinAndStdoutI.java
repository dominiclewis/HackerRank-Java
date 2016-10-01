package introduction; 
//import the scanner
import java.util.Scanner; 

public class JavaStdinAndStdoutI{
    
    public static void main(String[] args){
     //local variables
        int a,b,c;
        
        //Create object out of the Scanner
        Scanner scan = new Scanner(System.in);
        
        //accept values for all three ints 
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        //Output all three on seperate lines using printf instead of println
        System.out.printf("%d\n%d\n%d\n", a, b, c );
        
        
        
    }
}