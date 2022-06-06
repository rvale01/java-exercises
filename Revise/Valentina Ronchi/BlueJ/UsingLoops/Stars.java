import java.util.Scanner;
/**
 * Write a description of class Stars here.
 *
 * @author (Me)
 * @version (a version number or a date)
 * write a program that outputs row of seven stars repeted multiple times
 */
public class Stars
{
    public static void main (String args[]){
        Scanner snc = new Scanner(System.in);
        
        System.out.print("How many rows?\n");
        int row = snc.nextInt();
        int x = 1;
        
        for(int i=row; i>0; i--){
            System.out.print(x+":\t :-):-):-):-)\n");
            //System.out.print(x+":\t <3<3<3<3<3\n");
            //System.out.print(x+":\t *******\n");
              
            x++;
        }
    }
}

