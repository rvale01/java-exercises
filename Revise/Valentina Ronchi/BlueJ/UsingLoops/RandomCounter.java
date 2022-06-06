
/**
 * Write a description of class RandomCounter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 *  Write a program that generates two random numbers between 1 and 6.
 *  
 *  START LOOP
 *      GENERATE RANDOM NUM 1-6
 *      OUTPUT NUM
 *  REPEAT LOOP
 *  
 *  Change your program so that it output the two random number 5 times
 *  then count how many times the total of the two numbers was above 5
 *  
 *  START LOOP1
 *      START LOOP2
 *          GENERATE RANDOM NUM 1-6
 *          OUTPUT NUM
 *          ADD NUM TO TOTAL
 *          REPEAT LOOP2
 *      OUTPUT TOTAL
 * REPEAT LOOP2 5 TIMES
 */
public class RandomCounter
{
    public static void main (String args[]){
        //for(int x = 0; x<2;x++){
         //   int num = (int)(Math.random())*6+1;
         //   System.out.print(num);
         int total=0;
         int time = 0;
         int count = 1;
         for(int x = 0; x<5;x++){
             for(int y = 0; y<2;y++){
                 int num = (int)((Math.random())*6)+1;
                 total = total + num;
                 System.out.print("The random number is : "+ num+ "\n");
                 System.out.print("Group number: "+ count+".\n The total is "+total+"\n");  
                
                }
                if(total>5){
                    time++;}
               total=0;
               count++;
            }System.out.print("It was bigger than 5 '"+time+"' times");
        
                                  
    }
}


