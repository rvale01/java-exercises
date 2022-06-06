import java.util.Scanner;
/**
 * Write a description of class Array5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Create a program that uses a menu with the following options:
 * 1. Set size of array
 * 2a. Set range of values
 * 2b. generated
 * 3. Display the content of the Array
 * 4. Search
 * 5. Quit
 */
public class Array5
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int input;
        int size=0;
        int h;
        int random=0;
        int x=0;
        int[] num= new int[x];
        int search;
        boolean b= false;
        boolean d= false;
        
        do{
            System.out.print("1. Set size of array\n2. Set range of values and generated\n3. Display the content of the Array\n4. Search\n5. Quit\n");
            input = scn.nextInt();
            
            switch(input){
                case 1:{
                    System.out.print("Set the size of the array");
                    size = scn.nextInt();
                    
                    num = new int [size];
                }break;
                case 2 :{
                    if(size!=0){
                    
                    System.out.print("input the highest value of the range:\n");
                    h = scn.nextInt();
                    
                    for(x= 0; x<size;x++){
                        random = (int)((Math.random())*h)+1;
                        num[x]=random;
                    }
                }else{
                    System.out.print("Input first the size of the Array\n");
                    
                }
                }break;
                case 3 : {
                    if(size!=0 || random!=0){
                    for(x=0; x<size; x++){
                        System.out.print(num[x]+"\n");
                    }
                }else{
                    System.out.print("Input first the size of the Array\n");
                    
                }
                }break;
                case 4: {
                    if(size!=0 || random!=0){
                System.out.print("Input the value you want to search:\n");
                search = scn.nextInt();
                for(x= 0;x<size;x++){
                    if(search == num[x]){
                        d = true; break;
                    }else if(search != num[x]){d = false;}
                }
                if(d == true){
                    System.out.print("Guessed\n");
                }else{System.out.print("Not guessed\n");}
                
            
            }else{
                    System.out.print("Input first the size of the Array\n");
                    
                }
                }break;
                
                case 5:{
                    b = true;
                }break;
                
                
                default: System.out.print("Try again\n");
            }
            
        }while(b !=true);
    }
}
