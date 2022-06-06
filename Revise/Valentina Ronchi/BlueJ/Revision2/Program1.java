import java.util.*;

/**
 * Write a description of class Program1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Find the power of a given number.
 * ask the user to enter two number and find the power.
 * Check if the answer is between 100 and 150, between 151 and 200 or above 200.
 * add validation so that the base number cannot be 0;
 */
public class Program1
{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Input the base number : ");
        int a = scn.nextInt();
        do{
            System.out.print("The value input is not correct! Try again.");
            a = scn.nextInt();
            
        }while(a==0);
        
        System.out.print("Input the power number: ");
        int b = scn.nextInt();        
        
        int pow = (int)Math.pow(a,b);
        System.out.println("The result is : "+ pow);
        
        if(pow<100){
            System.out.println("Value below 100");
            
        }else if(pow>=100 && pow<=150){
            System.out.println("Value between 100 and 150");
            
        }else if(pow>150 && pow<200){
            System.out.println("The value is between 150 and 200");
        }else if(pow>=200){
            System.out.println("the value is more than 200");
        }
    }
}
