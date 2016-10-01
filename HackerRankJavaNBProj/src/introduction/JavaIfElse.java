    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package introduction;

    import java.util.Scanner;
    /**
     *
     * @author Dominic
     */
    public class JavaIfElse {

    public static void main(String[] args){

        int n;   //int n will be the the number we use, x will be used to check if the number is positive
        boolean even = true;  // this will be used to check if that value is true 

        Scanner scan = new Scanner(System.in); //Create a new object of the scanner 

        n = scan.nextInt();   //n is our input

        //check if n is even or odd 
      //if m!= 1 then then number is odd as it cannot be divided wholey by two 

     //IF NETBEANS SAYS IF IS REDUNDANT INITILIASE VARIABLE ABOVE
     //If n/2 leaves a remainder this means that the number is odd as even numbers divide perfectly into two
       if ((n % 2) != 0){
         even = false;   
       } 
       
         
               if( even == true && ((n >= 2 && n <=5) || (n > 20))){    //not weird output conditions 
                 System.out.println("Not Weird");

               
        }
              
          
               else if ((even == false) || (even == true && n >= 6 && n<= 20) ){ //weird output conditions
                    System.out.println("Weird");


                    
                         }
    }
    }