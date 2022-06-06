import java.util.Scanner;
/**
 * Write a description of class WhileNegative3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * Change the program so that it uses a boolean in the do while condition
 * the program will stop only when -1 is used
 */
public class WhileNegative3
{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        int num;
        boolean sta = false;
        do{
            System.out.print("Input a number :\n ");
            num = scn.nextInt();
            if (num == (-1)){
                sta = true;
            }
        }while (sta == false);
    }
}
