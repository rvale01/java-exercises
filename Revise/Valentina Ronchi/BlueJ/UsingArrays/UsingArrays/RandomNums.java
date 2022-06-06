
/**
 * Write a description of class RandomNums here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Fill an array with random numbers in the range of 0 to 5000
 * The size of the array has to be 10,000. Output the conten of the array. Output the total and the average.
 */
public class RandomNums
{
    public static void main (String args[]){
        int average;
        int randomNum;
        int x;
        int[]num = new int[10000];
        int tot = 0;
        
        for(x=0;x<num.length; x++){
            
            randomNum = (int)(Math.random()*5000);
            num[x] = randomNum;
            tot+= num[x];
            
        }
        for(x=0;x<num.length; x++){
            System.out.print("The number n. "+x+ "is " +num[x]+"\n");
        }
        System.out.print("The total is " + tot+"\n");
            average = tot/10;
            System.out.print("The average is " + average+"\n");
    }
}
