import java.util.Scanner;
/**
 * Write a description of class MockTask1Question2 here.
 * valentina ronchi id: 0196510A
 * @author (your name)
 * @version (a version number or a date)
 * 
 */
public class MockTask1Question2
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Input your Earth weight: ");
        double eWeight = scn.nextDouble();
        
        System.out.println("Menu Choose one of the following:\n1-Mercury\n2-Venus\n3-Jupiter\n4-Saturn\n5-Output all values ");
        int option = scn.nextInt();
        double mWeight = eWeight* 0.4;
        double vWeight = eWeight* 0.9;
        double jWeight = eWeight* 2.5;
        double sWeight = eWeight* 1.1;
        
        switch(option){
            case 1:{
                System.out.println("Your weight on Mercury is " + mWeight);
                                
            }break;
            case 2 :{
                System.out.println("Your weight on Venus is " + vWeight);
            }break;
            case 3: {
                System.out.println("Your weight on Jupiter is " + jWeight);
            }break;
            case 4: {
                System.out.println("Your weight on Saturn is " + sWeight);
            }break;
            case 5: {
                System.out.println("Your weight on Mercury is " + mWeight);
                System.out.println("Your weight on Venus is " + vWeight);
                System.out.println("Your weight on Jupiter is " + jWeight);
                System.out.println("Your weight on Saturn is " + sWeight);
            }break;
            default: System.out.print("Wrong choice!");
        }
        
    }
}
