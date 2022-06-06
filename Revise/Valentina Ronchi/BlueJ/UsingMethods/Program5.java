import java.util.Scanner;
/**
 * Write a description of class Program5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program5
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        calcVolumeS();
        
        System.out.println("Input the radius of the sphere:");
        int r = scn.nextInt();
        double p = 3.14;
        
        calcVolumeS(r);
        
        calcVolumeS(r,p);
        
        
    }
    
    public static void calcVolumeS(){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Input the radius of the sphere:");
        int r = scn.nextInt();
        double p = 3.14;
        double v = (4.0/3.0)*Math.pow(r,3)*Math.PI;
        
        System.out.println("The result n.1 is:"+v);
        
    }
    
    public static void calcVolumeS(int r){
        double p = 3.14;
        double v = (4.0/3.0)*Math.pow(r,3)*Math.PI;
        System.out.println("The result n.2 is: "+v);
    }
    
    public static void calcVolumeS(int r, double p ){
         double v = (4.0/3.0)*Math.pow(r,3)*p;
         System.out.println("The result n.3 is: "+v);
    }
    
}
