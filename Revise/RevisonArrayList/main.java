import java.util.*;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        boolean b = false;
        ArrayList dogs = new ArrayList();
        do{
            System.out.println("Menu");
            System.out.println("1. Add dog");
            System.out.println("2. Display all dogs with name starting with a particular char");
            System.out.println("3. Display using toString");
            System.out.println("4. Display by pos");
            System.out.println("5. Delete dogs");
            System.out.println("6. Input a mobile phone");
            System.out.println("7. Sort by id");
            System.out.println("8. Exit");

            int option = scn.nextInt();
            switch(option){

                case 1: dogs = addDogs(dogs) ;break;
                case 2: display(dogs, 'g');break;
                case 3: display(dogs); break;
                case 4: 
                {
                    System.out.println("Input the pos you want to display");
                    int pos = scn.nextInt();
                    displayByPos(dogs,pos);
                }
                break;
                case 5: dogs = deleteDog(dogs);break;
                case 6: mobValidation();break;
                case 7: sortArrayList();break;
                case 8: b = true;break;
                default: System.out.println("Wrong input");
            }

        }while(b == false);
    }
    
    public static void sortArrayList(){
        Scanner scn = new Scanner(System.in);
        ArrayList <String> arr = new <String> ArrayList();
        
        for(int x = 0; x<8; x++){
            System.out.println("Input a name");
            arr.add(scn.next());
                        
        }
        
        Collections.sort(arr);        
        System.out.println(arr);        
        
        Collections.reverse(arr);
        System.out.println(arr);
    }

    public static ArrayList addDogs(ArrayList dogsList){
        Scanner scn = new Scanner(System.in);
        System.out.println("How many dogs do you want to add? ");
        int choice = scn.nextInt();

        for(int x = 0; x< choice; x++){
            Dog dog = new Dog();
            
            int id = generateId(dogsList, x);
            dog.setId(id);
            
            System.out.println("Name: ");
            dog.setName(scn.next());

            System.out.println("Breed: ");
            dog.setBreed(scn.next());

            System.out.println("Number of legs: ");
            dog.setNofLegs(scn.nextInt());

            System.out.println("Colour: ");
            dog.setColour(scn.next());

            dogsList.add(dog);
        }

        return dogsList;
    }

    public static int generateId(ArrayList arrDog, int pos){
        int id =-1;
        System.out.println(id);
        boolean b = true;
        do{
            id = (int)(Math.random()*100+5);
            b = true;
            for(int x = 0; x<arrDog.size(); x++){
                Dog dog = new Dog();
                dog = (Dog)arrDog.get(x);

                if(dog.getId() == id){
                    id = (int)(Math.random()*100+5);
                    b = false;
                }
            }
        }while(b == false);
        return id;
    }

    public static void display(ArrayList arrDog, char ch){
        for(int x = 0; x< arrDog.size(); x++){
            Dog dogs = new Dog();
            dogs = (Dog)arrDog.get(x);
            String name = dogs.getName();

            if(name.charAt(0) == ch){
                System.out.println("Name: "+ dogs.getName());
                System.out.println("Breed: "+ dogs.getBreed());
                System.out.println("Number of legs: "+ dogs.getNofLegs());
                System.out.println("Colour: "+ dogs.getColour());
            }

        }
    }

    public static void display(ArrayList arrDog){
        for(int x = 0; x< arrDog.size(); x++){
            Dog dogs = new Dog();
            dogs = (Dog)arrDog.get(x);

            System.out.println(dogs.toString());
        }
       
    }

    public static void displayByPos(ArrayList arrDog, int pos){
        try{
            Dog dog = new Dog();
            dog = (Dog)arrDog.get(pos);
            System.out.println(dog.toString());
        }catch(IndexOutOfBoundsException a){
            System.out.println("The index is wrong!");
        }

    }

    public static int mobValidation(){
        Scanner scn = new Scanner(System.in);
        boolean b = false;
        do{
            try{
                b = false;
                System.out.println("Input the mobile: ");
                int number = scn.nextInt();
                String n = Integer.toString(number);

                if(Integer.toString(number).length() != 8){
                    throw new Exception();
                }
                return number;
            }catch(InputMismatchException a ){
                System.out.println("The input has to be a number");
                b = true;
                return -1;
            }catch(Exception e){
                System.out.println("The number has to be 8 digits");
                b = true;
                return -1;
            }
        }while(b == true);
    }

    public static ArrayList deleteDog(ArrayList arrDog){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the name of the dog you want to delete");
        String name = scn.next();

        for(int x = 0; x< arrDog.size(); x++){
            Dog dog = new Dog();
            dog = (Dog)arrDog.get(x);

            if(name.equalsIgnoreCase(dog.getName())){
                arrDog.remove(x);
                return arrDog;
            }
        }
        return arrDog;
    }

}
