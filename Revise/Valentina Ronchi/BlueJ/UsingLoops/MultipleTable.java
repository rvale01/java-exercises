import java.util.Scanner;
/**
 * Write a description of class MultipleTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Ask the user for a value between 1 and 12 and output its time stable and 
 */
public class MultipleTable
{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("input a number between 1 and 12\n");
        int y = scn.nextInt();
        int x=0;
        
        
        do {
            System.out.print("Incorrect value. Try again:\n");
            y = scn.nextInt();            
        }while(y>12 ||y<0);
        
        while(x<12){
            int ans = y*x;
           System.out.print(y+"*"+x+"="+ans+"\n");
           x++;
        }
      
        
    }
}
