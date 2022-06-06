import java.util.Scanner;
/**
 * Write a description of class Program1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * create a method that displays the area of a square. Use this signature 
 */
public class Program1
{
    public static void main(String args[]){
        areaSquare();
    }
    
    public static void areaSquare(){
         Scanner scn = new Scanner(System.in);
         
         System.out.print("Input the length of the square\n");
         int length = scn.nextInt();
         int area = length*length;
         System.out.print("The area of the square is "+area);
                  
        }
}
