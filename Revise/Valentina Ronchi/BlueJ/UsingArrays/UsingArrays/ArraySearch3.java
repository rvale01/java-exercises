import java.util.Scanner;
/**
 * Write a description of class ArraySearch3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Write a program that uses a boolean to print "found" or "Not found"
 */
public class ArraySearch3
{
   public static void main(String args[]){
       Scanner scn = new Scanner(System.in);
       int [] num = new int[5];
       int x;
       boolean b = false;
       
       for (x=0;x<num.length;x++){
           System.out.print("Input the number\n");
           num[x] = scn.nextInt();
        }
        System.out.print("Input the number you want to search:\n");
        int search = scn.nextInt();
        
        for(x=0;x<num.length;x++){
            if(num[x] == search){
                b = true; break;
            } else {b = false;}
        }
       if(b == true){
           System.out.print("Found");
        }else if (b == false){
            System.out.print("Not found");
        }
    }
}
