import java.util.*;
/**
 * Write a description of class Validation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Validation
{
    public int validateInt(){
        boolean b = true;
        do{ 
            b = true;
            try{
                Scanner scn = new Scanner(System.in);
                int value = scn.nextInt();
                return value;
            }catch(InputMismatchException e){
                System.out.println("You have to input a number!");
                b = false;
            }
        }while( b == false);
        return -1;
    }

    public int validateBatteryFuel(){
        Scanner scn = new Scanner(System.in);
        boolean b = false;
        do{ 
            System.out.println("Input level: ");
            int level = validateInt();
            try{
                b = false;
                if(level>100 || level<0){
                    throw new Exception();
                }
                return level;
            }catch(Exception e){
                System.out.println("The value is not in the range");
                b = true;
            }
        }while(b == true);
        return -1;
    }
}
