import java.util.Scanner;
/**
 * Write a description of class Array2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * write a program that has a list of products together with their price.
 * need two array , one for names and other for prices.
 * The user will choice the size of the array;
 */
public class Array2
{
    public static void main(String args[]){
        Scanner scn = new Scanner (System.in);
        
        System.out.print("Input the number of products that you want to add\n");
        int num = scn.nextInt();
              
        String[] name = new String [num];
        int[] price = new int[num];
        int x;
        
        for(x=0;x<name.length; x++){
            System.out.print("Input the name of the product n."+ x+" ");
            name[x]=scn.next();
            System.out.print("Input the price of "+name[x]+" ");
            price[x]=scn.nextInt();
                        
        }
        
        //for(x=0;x<num;x++){
         //   System.out.print("Input the price of "+name[x]+"\n");
         //   price[x]=scn.nextInt();
                        
        //}
        
        for(x=0;x<num;x++){
            System.out.print("\nThe product: "+ name[x]+ " has a cost of:  euro " + price[x]);
            
                        
        }
        
    }
}
