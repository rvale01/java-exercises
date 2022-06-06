import java.util.Scanner;
/**
 * Write a description of class MockTask1Question1 here.
 * valentina ronchi id: 0196510A
 * @author (your name)
 * @version (a version number or a date)
 * 
 */
public class MockTask1Question1
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int area;
        boolean b = false;
        
        System.out.print("Input the value of the side of the square: ");
        int side = scn.nextInt();
        
        do{
        if(side<=0){
            System.out.print("Input not valid! Try again: ");
            side = scn.nextInt();
            b = true;
        }else{
        area = side*side;
        
        System.out.println("The Area of the square measuring "+side+" m * "+side+" is "+area+ " m");
        double cost = 4.00;
        double tcost = 4.00*area;
        
        System.out.print("The total cost is: "+ tcost);
        b = false;
    }
    
}while (b == true);
    
    
    }
}
