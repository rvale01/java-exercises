import java.util.Scanner;
/**
 * Write a description of class MockTask1Question4 here.
 * valentina ronchi id: 0196510A
 * @author (your name)
 * @version (a version number or a date)
 */
public class MockTask1Question4
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter Username: ");
        String username = scn.next();
        
        System.out.print("Enter new Paswword: ");
        String password = scn.next();
        
        System.out.print("Confirm new Password: ");
        String password2 = scn.next();
        
        if(password2.equals(password)){
            System.out.print("Good!");
        } else{
            System.out.print("Passwords do not match!");
        }
    }
}
