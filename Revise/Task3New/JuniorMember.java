import java.util.*;
/**
 * Write a description of class JuniorMember here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JuniorMember extends Member
{
    private String type;

    public JuniorMember(){
        super();
        this.type="Junior";
    }

    public JuniorMember(String name, String surname, int mobile, String memberNumber, String type){
        super(name, surname, mobile, memberNumber);
        type = "Junior";
    }

    public String type(){
        return "Junior"+super.toString();
    }

    public JuniorMember[] input(JuniorMember[] junior){
        Scanner scn = new Scanner(System.in);

        for(int x = 0; x<junior.length; x++){
            JuniorMember jm = new JuniorMember();
            System.out.println("Name: ");
            jm.setName(scn.next());

            System.out.println("Surname: ");
            jm.setSurname(scn.next());

            jm.setMobile(validation());

            boolean b;
            String value;
            do{ 
                b=false;
                System.out.println("Membership number");
                value= scn.next();
                if(x==0){
                    b = false;
                }else{
                    for(int y = 0; y<x; y++){
                        JuniorMember temp = new JuniorMember();
                        temp = (JuniorMember)junior[y];
                        if(temp.getMemberNumber().equalsIgnoreCase(value)){
                            b = true;
                            System.out.println("Input not valid! Try again!");
                        }
                    }
                }
            }while(b == true);
            jm.setMemberNumber(value);

            junior[x] = jm;
        }

        return junior;
    }

    public void displayJuniorMember(JuniorMember [] junior){
        for(int x = 0; x<junior.length; x++){
            System.out.println(junior[x]);
            System.out.println("Fee: "+calcMembership());
            System.out.println(" ");
        }
    }

    public int search (JuniorMember [] junior){
        for(int x = 0; x<junior.length;x++){
            Scanner scn = new Scanner(System.in);
            JuniorMember j = new JuniorMember();
            j = (JuniorMember)junior[x];

            System.out.println("Input the the membership number of the member you want to look for: ");
            String temp = scn.next();

            if(j.getMemberNumber().equalsIgnoreCase(temp)){
                return x;
            }
        }

        return -1;
    }
    
     public int search (JuniorMember [] junior, String id){
        for(int x = 0; x<junior.length;x++){
            Scanner scn = new Scanner(System.in);
            JuniorMember j = new JuniorMember();
            j = (JuniorMember)junior[x];


            if(j.getMemberNumber().equalsIgnoreCase(id)){
                return x;
            }
        }

        return -1;
    }
    
    public int search2 (JuniorMember [] junior, String name){
        for(int x = 0; x<junior.length;x++){
            Scanner scn = new Scanner(System.in);
            JuniorMember j = new JuniorMember();
            j = (JuniorMember)junior[x];


            if(j.getMemberNumber().equalsIgnoreCase(name)){
                return x;
            }
        }

        return -1;
    }

    public int validation(){
        boolean b = true;
        int mobile = 0;
        do{

            try{
                b = true;
                Scanner scn = new Scanner(System.in);
                System.out.println("Mobile: ");
                mobile = scn.nextInt();
                int length = String.valueOf(mobile).length();
                if(length!=8){
                    throw new Exception();
                }
            }catch(InputMismatchException  e){
                System.out.println("The value must be a number!");
                b = false;
            }catch (Exception e){
                System.out.println("The number cannot be bigger than 8 digits!");
                b= false;
            }
        }while(b == false);

        return mobile;
    }

    public JuniorMember[] editJuniorMember(JuniorMember[] juniorArray){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the membership number of the member you want to edit");
        String id = scn.next();
        JuniorMember junior = new JuniorMember();

        int index = search(juniorArray);
        junior = (JuniorMember)juniorArray[index];

        if(index !=-1){
            System.out.println("1.Name");
            System.out.println("2.Surname");
            System.out.println("3.Mobile");
            System.out.println("4.Membership number");
            int option = scn.nextInt();

            switch(option){
                case 1:{
                    System.out.println("Name: ");
                    junior.setName(scn.next());
                };break;
                case 2:{
                    System.out.println("Surname: ");
                    junior.setSurname(scn.next());
                };break;
                case 3:{
                    junior.setMobile(validation());
                };break;
                case 4:{
                    System.out.println("Membership number: ");
                    junior.setMemberNumber(scn.next());
                };break;
            }
            juniorArray[index] = junior;

        }else{
            System.out.println("The member was not found!");
        }
        return juniorArray;
    }
    
    public double calcMembership(){
        return 39.99;
    }
}
