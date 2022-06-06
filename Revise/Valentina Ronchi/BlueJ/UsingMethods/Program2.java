import java.util.Scanner;
/**
 * Write a description of class Program2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Write a program that displays a something a number of times.
 * The user will enetr how many time to display.
 * 
 */
public class Program2
{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input how many times you want to display it: \n");
        int num = scn.nextInt();
        
        symbDisplay(num);
        
    }
    public static void symbDisplay(int x){
        for (int i=0;i<x; i++){
            System.out.print("$\n");
        }
    }
}
