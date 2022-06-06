import java.util.Scanner;
/**
 * Write a description of class MinMax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * Find the largest and the smallest integer number in an array.
 */
public class MinMax
{
    public static void main(String args []){
        Scanner scn = new Scanner(System.in);
        int x= 0;
        int[] arr = new int[5];
        int max = 0;
        int min = 10;
        int random = 0;
        
        for (x=0;x<arr.length;x++){
           random=(int)((Math.random())*10)+1;
           arr[x]=random;
           System.out.print(random+"\n");
        }
        for(x=0;x<5;x++){
            if(max<arr[x]){
                max = arr[x];
            } 
            if(arr[x]<min){
                min = arr[x];
            }
        }
        
        System.out.print("The max number is "+ max +"\n");
        System.out.print("The min number is "+ min +"\n");
    }
}
