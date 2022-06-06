import java.util.Scanner;
/**
 * Write a description of class WhileNegative2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * the program should stop only when -1 is entered or -5
 */
public class WhileNegative2
{
    public static void main (String args []){
        Scanner scn = new Scanner(System.in);
        int num;
        do{
            System.out.print("Input a number: \n ");
            num = scn.nextInt();
        }while (num!= (-1) && num!= (-5));
    }
}
