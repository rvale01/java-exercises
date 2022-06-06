import java.util.Scanner;
/**
 * Write a description of class Program4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * ask for three names, then ask for an index value.
 * Save the names in an array and use a method to output the name at that position
 */
public class Program4
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String[] name = new String[3];
        
                
        for( int x =0;x<3;x++){
            System.out.print("Inout the name n."+(x+1));
            name[x]= scn.next();
        }
        
        System.out.print("Input the index value you want to show");
        int pos = scn.nextInt();
        
        displayPos(name, pos);
    }
    
    public static void displayPos(String [] name,int pos){
       System.out.print("The name is "+name[pos-1]);
    }
    
}
