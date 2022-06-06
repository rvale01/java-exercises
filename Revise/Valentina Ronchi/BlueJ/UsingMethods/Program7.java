import java.util.Scanner;
/**
 * Write a description of class Program7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Use two methods to find the surface area of a bathroom
 * h*l*4
 * l*w
 */
public class Program7
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        double t = sumArea();
        System.out.println("the price n.1 is "+ t);
        
        System.out.println("Input the price:");
        double price = scn.nextDouble();
        
        double total = sumArea(price);
        System.out.println("The total n.2 is"+total);
    }
    
    public static double sumArea(){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Input the height:");
        double h= scn.nextDouble();
        
        System.out.println("Input the weight: ");
        double w = scn.nextDouble();
        
        System.out.println("Input the length: ");
        double l = scn.nextDouble();
        
        double area = (h*l*4.0)+(l*h);
        System.out.print("Input the price:");
        double price = scn.nextDouble();
        double total = price*area;
        return total;
        
    }
    
    public static double sumArea(double price){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the height:");
        double h = scn.nextDouble();
        
        System.out.println("Input the weight:");
        double w = scn.nextDouble();
        
        System.out.println("Input the lenght");
        double l = scn.nextDouble();
        
        double area = (h*l*4.0)+(l*h);
        
        double total = area*price;
         
        return total;
        
    }
}
