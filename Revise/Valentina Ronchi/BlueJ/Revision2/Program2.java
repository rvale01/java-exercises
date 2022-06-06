import java.util.*;
/**
 * Write a description of class Program2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * populate an array with random numbers in the range of 50 to 100;
 */
public class Program2
{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
         int[] arr = new int[10];
         
         for(int x = 0; x<arr.length; x++){
             arr[x] = (int)(Math.random()*(100-50)+50);
             System.out.println(arr[x]);
            }
        
            
    }
}
