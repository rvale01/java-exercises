
/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public static void main(String args[]){
        fibonacci(1,0,0);
    }
    
    public static void fibonacci(int numb, int pnumb, int counter){
        
        int nNumb = numb +pnumb;
        System.out.println(nNumb);
        
        counter++;
        
        if(counter<25){
            fibonacci(nNumb, numb, counter);
        }
        
    }
}
