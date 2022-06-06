import java.util.Scanner;
/**
 * Write a description of class ArraySearch1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * random numbers, input number by the user and search for it
 */
public class ArraySearch1
{
    public static void main (String args[]){
        Scanner scn = new Scanner (System.in);
        int[] num = new int[5];
        int x;
        int numbIn;
        
        for(x=0;x<num.length; x++){
            System.out.print("Input the numbers: \n");
            numbIn = scn.nextInt();
            num[x]= numbIn;
        }
        System.out.print("Input the value you want to search:\n");
        int numbSe = scn.nextInt();
        
        for(x=0;x<num.length; x++){
            if(num[x] == numbSe){
                System.out.print("Found");
            }
       }
    }
        
        
}

