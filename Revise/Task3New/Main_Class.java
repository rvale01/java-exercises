import java.util.*;
/**
 * Write a description of class Main_Class here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main_Class
{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        boolean b = false;
        SeniorMember[] seniorArray = new SeniorMember[3]; 
        SeniorMember senior_member = new SeniorMember();
        
        JuniorMember junior_member = new JuniorMember();
        JuniorMember[] juniorArray = new JuniorMember[3];
        
        
        do{
            System.out.println("---Menu---");
            System.out.println("1. Enter Senior Member");
            System.out.println("2. Enter Junior Member");
            System.out.println("3. Display Senior Member");
            System.out.println("4. Display Junior Member");
            System.out.println("5. Edit Senior Member");
            System.out.println("6. Edit Junior Member");
            System.out.println("7. Exit");
            int option = scn.nextInt();
            
            switch(option){
                case 1: seniorArray=senior_member.input(seniorArray);break;
                case 2: juniorArray=junior_member.input(juniorArray);break;
                case 3: senior_member.displaySeniorMember(seniorArray);break;
                case 4: junior_member.displayJuniorMember(juniorArray);break;
                case 5: seniorArray=senior_member.editSeniorMember(seniorArray);break;
                case 6: juniorArray=junior_member.editJuniorMember(juniorArray);break;
                case 7: b = true;break;
                
                default: System.out.println("The input is worng, please try again!");
             
            }
            
        }while(b == false);
    }
}
