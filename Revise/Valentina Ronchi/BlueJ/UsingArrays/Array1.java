import java.util.Scanner;
/**
 * Write a description of class Array1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * write a program that fills an array with 10 value and then prints them.
 * The user must enters the values and format your output sh
 */
public class Array1
{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        int[] nums  = new int [10];
        int x;
        for(x=0;x<nums.length;x++){
            System.out.print("Input value n."+x+"\n");
            nums[x]=scn.nextInt();
                                  
        }
        for(x=0;x<nums.length;x++){
            System.out.print("This is the value n."+x+":"+ nums[x]+"\n\n");
        }
    }
}
