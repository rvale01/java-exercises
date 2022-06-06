import java.util.Scanner;
/**
 * Write a description of class Decrement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * output a list of numbers in the range given by the user.
 * use a for loop. Eg. if the user enter 2 and 20, output the values from 20
 * to 2.
 */
public class Decrement
{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
    
    System.out.print("Enter the first number:\n");
    int first = scn.nextInt();
    
    System.out.print("Enter last value:\n");
    int last = scn.nextInt();
    
       for (int x=last; x>=first; x--){
        System.out.print(x+"\n");
       }
    }
}
