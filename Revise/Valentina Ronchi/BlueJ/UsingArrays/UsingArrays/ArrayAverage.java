import java.util.Scanner;
/**
 * Write a description of class ArrayAverage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Create a program that calculates the average in the list. The user has to input the list. The user decide the array size.
 */
public class ArrayAverage
{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("How many numbers do you want to input? ");
        int length = scn.nextInt();
        int x;
        int tot = 0;
        int[] num = new int[length];
        
        
        for(x=0;x<length; x++){
            System.out.print("Input value n."+ x+" ");
            num [x] = scn.nextInt();
            tot = tot+num[x];
        }
        int average = tot/length;
        System.out.print("the average of the numbers in the list is: "+average);
    }
}
