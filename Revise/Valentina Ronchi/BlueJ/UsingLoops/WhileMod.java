import java.util.Scanner;
/**
 * Write a description of class WhileMod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * write a program that generates random numbers in the range of 0 and 2000.
 * The program will stop if the generated number is even (number mod 2)
 * also output the list of generated numbers
 */
public class WhileMod
{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        boolean b = false;
        do{
            int num = (int)(Math.random()*2000);
            System.out.print(num+"\n");
            if((num%2) == 0 ){
                b = true;
            }
            
        }while(b == false);
        
    }
}
