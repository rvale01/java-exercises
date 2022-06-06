import java.util.Scanner;
/**
 * Write a description of class Decrement2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * repeat the same program using while loop
 */
public class Decrement2
{
    public static void main(String args[]){
        Scanner snc = new Scanner(System.in);
        System.out.print("Input the highest value:\n");
        int hig = snc.nextInt();
        
        System.out.print("Input the lowest value:\n");
        int low = snc.nextInt();
        
        while(hig>=low){
            System.out.print(hig+"\n");
            hig--;
        }             
      }
   }
