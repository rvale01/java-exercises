import java.util.Scanner;
/**
 * Write a description of class WhileNegative here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * ask to the user a number until the number is uqual to -1
 * 
 */
public class WhileNegative
{
   public static void main (String args[]){
      Scanner scn = new Scanner(System.in);
      int num;
       do{
           System.out.print("Input the number: \n");
           num = scn.nextInt();
        }while(num!= (-5));
    }
}
