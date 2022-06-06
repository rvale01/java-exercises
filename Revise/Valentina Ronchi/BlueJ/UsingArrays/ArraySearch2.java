import java.util.Scanner;
/**
 * Write a description of class ArraySearch2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * fill an array of seven names, display its content, ask the user for a name and output it 
 * 
 */
public class ArraySearch2
{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        String[] names = new String [7];
        int x;
        String search;
        
        for(x = 0; x<5; x++){
            System.out.print("Input the names:\n");
            names[x] = scn.next();
        }
        System.out.print("Which name you want to search:\n");
        search = scn.next();
        
        for(x= 0; x<5;x++){
            if(search.equalsIgnoreCase(names[x])){
                System.out.print("Found\n");
            }
        }
        
    }
}
