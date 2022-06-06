import java.util.Scanner;
/**
 * Write a description of class WhileNegative4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * ask the user to enter the dimensions of a triangle and calculate the area.
 * The program wil stop when the base of the triangle is -1.
 * Use a boolean for the condition.
 */
public class WhileNegative4
{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        
        int h;
        int ba; 
        boolean b = false;
        do{
            System.out.print("Input the height of the triangle: \n");
            h = scn.nextInt();
                        
            System.out.print("Input the base of the triangle: \n");
            ba = scn.nextInt();
            
            
            if (h == (-1)){
                b = true;
            }else if ( h!= (-1)){
                int area = (ba*h)/2;
            System.out.print("The area is: "+area+"\n");
            }
        }while(b == false);
        
        
    }
}
