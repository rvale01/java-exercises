import java.util.Scanner;
/**
 * Write a description of class MarkValidator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * write a program that ask the user a vallue between 0 and 100
 * and output pass and fail. Validate the input.
 */
public class MarkValidator
{
   public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    
    int mark;
    
      do{
          System.out.print("Input the value of your mark:\n");
          mark = scn.nextInt();
      }while(mark>100 || mark<0);
      
      if(mark>=50){
          System.out.print("Passed :)");          
        } else if (mark<50) {
          System.out.print("Failed :(");
        }
        
   }
}
