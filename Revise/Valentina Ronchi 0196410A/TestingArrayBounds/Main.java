import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//write a program that creates an array of int of 4 items. Ask the user to output one of the elements
//Output an error message if the pos is out of bounds
public class Main
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int [] arr = new int [4];
        
        System.out.println("Input the values of the array: ");
        for (int x = 0; x<arr.length; x++){
            arr[x]=scn.nextInt();
        }
        boolean b = false;
        do{
            System.out.println("Input the index of the value you want to output:");
            b = handleArray(arr);
        }while (b == true);
         
    }
    
    public static boolean handleArray( int[] arr){
        Scanner scn = new Scanner(System.in);
        int index=-1;
        boolean b = false;
        try{
            index = scn.nextInt();
        if(index>arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
       }catch(InputMismatchException e){
            System.out.print("The value is not a number ");
            b = true;
        }catch(ArrayIndexOutOfBoundsException i){
           System.out.println("The value is wrong");
           b= true;
        }finally{
             if(!(index>arr.length|| index == -1)){
             System.out.print(arr[index-1]);
        }
        }
        return b;
    }
}
