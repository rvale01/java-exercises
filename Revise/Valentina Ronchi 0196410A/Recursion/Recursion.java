import java.util.*;
/**
 * Write a description of class Recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recursion
{
    public void p(int c){
        if(c<10){
            System.out.println("Hello");
            c++;
            p(c);
        }
    }
    
    public int factorial(int value){
        if(value == 1){
            return 1; 
        }else{
            return( value *factorial(value-1));
        }
            
    }
    public static void main(String args[]){
        Recursion r = new Recursion();
        r.p(0);
        int value = r.factorial(3);
        System.out.print(value);
        
    }
}
