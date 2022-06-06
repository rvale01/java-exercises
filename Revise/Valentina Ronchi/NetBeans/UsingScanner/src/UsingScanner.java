import java.util.Scanner;



/**
 *
 * @author SECPC106
 */
public class UsingScanner {

    /**      
     * @param args
     */
    public static void main(String[] args) {
        // Use the scanner class to read three varibales a int, a double and a string
        // Name, age, money he has
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Insert your name: ");
        String name = scn.next();
        
        System.out.println("Insert your age: ");
        int age = scn.nextInt();
        
        System.out.println("Insert money : ");
        double money = scn.nextDouble();
        
        System.out.println("age: " + age + " name: " + name + " money: " + money);
        
        System.out.println("Insert money : ");
        char c = scn.next().charAt(0);
        System.out.println(c);
        //String inputchar = scn.next()
        //char finalChar = inputchar.charAt(0);
        //System.out.println(finalChar);
        
        
    }
    
}
