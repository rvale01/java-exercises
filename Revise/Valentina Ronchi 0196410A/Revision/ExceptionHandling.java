import java.util.*;
/**
 * Write a description of class Exception here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExceptionHandling
{
    public boolean StringHandling(String name,int num){
        boolean b = true;
        Scanner scn = new Scanner(System.in);
        try{
            if(name.length()< num){
           throw new Exception();
        }
        }catch(Exception e)
       {
        System.out.println("The length of the word has to be bigger! Try again");
        b = false;
       }
       return b;
    }
    
    public boolean IntHandling(int value, int num){
        boolean b = true;
        
         try{
            if(value > num){
           throw new Exception();
        }
        }catch(Exception e)
       {
        System.out.println("The number has to be smaller! Try again");
        b = false;
       }
       
       return b;
    }
    
    public boolean IntMin(int value, int min){
        boolean b = true;
        
        try{
            if(value<min){
                throw new Exception();
            }
            
        }
        catch(Exception e){
            System.out.println("The value is not valid! Try again, please.");
            b = false;
        }
        return b;
    }
    
    
}
