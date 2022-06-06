import java.util.Scanner;
/**
 * Write a description of class ArraySearch4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * make a program that generates random numbers between 1 and 30. Store 20 numbers in a array, ask the user to input guess one of those numbers, he has three chances.
 * 
 */
public class ArraySearch4
{
   public static void main (String args[]){
       Scanner scn = new Scanner(System.in);
       int [] num = new int[20];
       int x;
       int ranNum;
       int cha= 0 ;
       int input;
       boolean b = false;
       char ans=' ';
       
       for(x=0; x<20; x++){
           ranNum =(int)((Math.random())*30)+1;
           num[x] = ranNum;
           //System.out.print(num[x]+"\n");
        }
        
            
        
         do {System.out.print("Guess the numbers:\n");
            input = scn.nextInt();
                for(x=0; x<20; x++){
             if(input==num[x]){
                b = true;break;
           }else{ 
               b = false;              
            }
        }
        if(b == true){
           System.out.print("Guessed\n");
       }else if (b == false){
          System.out.print("not Guessed\n");
          cha++;
          if (cha==3){
             System.out.print("Do you want to try it again? Answer Y or N");
             ans = scn.next().charAt(0);
             cha=0;
                
            }
        }
        }while(ans!='N' && b == false);
        
        
    }
    
}
