import java.util.*;
/**
 * Write a description of class SeniorMember here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SeniorMember extends Member
{
    private String type;

    public SeniorMember(){
        super();
        type= "Senior";
    }

    public SeniorMember(String name, String surname, int mobile, String memberNumber, String type){
        super(name, surname, mobile, memberNumber);
        type = "Senior";
    }

    public String type(){
        return "Senior";
    }

    public String toString(){
        return type() +" "+ super.toString();
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
            }catch(InputMismatchException e){
                System.out.println("The value must be a number!");
                b = false;
            }catch (Exception e){
                System.out.println("The number cannot be bigger than 8 digits!");
                b= false;
            }
        }while(b == false);
        
        return mobile;
    }

    public SeniorMember[] input(SeniorMember [] senior){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the details");

        for(int x = 0; x<senior.length; x++){
            SeniorMember s = new SeniorMember();
            System.out.println("Name: ");
            s.setName(scn.next());

            System.out.println("Surname: ");
            s.setSurname(scn.next());

            
            s.setMobile(validation());

            boolean b;
            String value;
            do{
                b=false;
                System.out.println("Membership number:");
                value = scn.next();
                if(x==0){
                    b = false;
                }else{
                    for(int y = 0; y<x;y++){
                        SeniorMember s2 = new SeniorMember();
                        s2 = (SeniorMember)senior[y];
                        if(s2.getMemberNumber().equalsIgnoreCase(value)){
                            b = true;
                            System.out.println("Try again!The value is not valid");
                        }

                    }
                }
            }while(b == true);
            s.setMemberNumber(value);

            senior[x] = s;
        }
        return senior;
    }

    public void displaySeniorMember(SeniorMember[] senior){
        for(int x = 0; x<senior.length; x++){
            System.out.println(senior[x]);
            System.out.println("Fee: "+ calcMembership());
            System.out.println(" ");
        }
    }

    public int search (SeniorMember [] senior){
        for(int x = 0; x<senior.length;x++){
            Scanner scn = new Scanner(System.in);
            SeniorMember s = new SeniorMember();
            s = (SeniorMember)senior[x];

            System.out.println("Input the the membership number of the member you want to look for: ");
            String temp = scn.next();

            if(s.getMemberNumber().equalsIgnoreCase(temp)){
                return x;
            }
        }

        return -1;
    }
    
    public int search (SeniorMember [] senior, String id){
        for(int x = 0; x<senior.length;x++){
            Scanner scn = new Scanner(System.in);
            SeniorMember s = new SeniorMember();
            s = (SeniorMember)senior[x];

            if(s.getMemberNumber().equalsIgnoreCase(id)){
                return x;
            }
        }

        return -1;
    }
    
    public int search2(SeniorMember [] senior, String name){
        for(int x = 0; x<senior.length;x++){
            Scanner scn = new Scanner(System.in);
            SeniorMember s = new SeniorMember();
            s = (SeniorMember)senior[x];

            if(s.getName().equalsIgnoreCase(name)){
                return x;
            }
        }

        return -1;
    }

    public SeniorMember[] editSeniorMember(SeniorMember[] seniorArray){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the membership number of the member you want to edit: ");
        String id = scn.next();
        SeniorMember senior = new SeniorMember();

        int index = search(seniorArray);
        senior = (SeniorMember)seniorArray[index];

        if(index !=-1){
            System.out.println("1.Name");
            System.out.println("2.Surname");
            System.out.println("3.Mobile");
            System.out.println("4.Membership number");
            int option = scn.nextInt();

            switch(option){
                case 1:{
                    System.out.println("Name: ");
                    senior.setName(scn.next());
                };break;
                case 2:{
                    System.out.println("Surname: ");
                    senior.setSurname(scn.next());
                };break;
                case 3:{
                    System.out.println("Mobile: ");
                    senior.setMobile(validation());
                };break;
                case 4:{
                    System.out.println("Membership number: ");
                    senior.setMemberNumber(scn.next());
                };break;
            }
            seniorArray[index] = senior;
        }else{
            System.out.println("The member was not found!");
        }

        return seniorArray;
    }
    
    public double calcMembership(){
        return 29.99;
    }
}
