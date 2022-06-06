import java.util.*;
/**
 * Write a description of class UsingAnimal2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UsingAnimal2
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        ArrayList arrDog = new ArrayList();
        ArrayList arrCat = new ArrayList();
        Cat c = new Cat ();
        Dog d = new Dog();
        
        System.out.println("Add dog details: ");
        
        System.out.println("Enter name: ");
        d.setName(scn.next());
        
        System.out.println("Enter colour: ");
        d.setColour(scn.next());
        
        System.out.println("Enter breed: ");
        d.setBreed(scn.next());
        
        System.out.println("Enter food: ");
        d.setFood(scn.next());
        
        System.out.println("Enter number of legs: ");
        d.setNofLegs(scn.nextInt());
        arrDog.add(d);
        
        
        System.out.println("Add cat details: ");
        
        System.out.println("Enter name: ");
        c.setName(scn.next());
        
        System.out.println("Enter colour: ");
        c.setColour(scn.next());
        
        System.out.println("Enter remaining lives: ");
        c.setRemaning(scn.nextInt());
        
        System.out.println("Enter food: ");
        c.setFood(scn.next());
        
        System.out.println("Enter number of legs: ");
        c.setNofLegs(scn.nextInt());
        arrCat.add(c);
        
        for(int x = 0; x<arrDog.size(); x++){
            Dog d2 = new Dog();
            d2 = (Dog)arrDog.get(x);
            System.out.println("Name: "+ d2.getName());
            System.out.println("Breed: "+ d2.getBreed());
            System.out.println("Colour: "+ d2.getColour());
            System.out.println("Food: "+ d2.getFood());
            System.out.println("Number of legs: "+ d2.getNofLegs());
        }
        
        for(int x = 0; x<arrDog.size(); x++){
            Cat c2 = new Cat();
            c2 = (Cat)arrCat.get(x);
            System.out.println("Name: "+ c2.getName());
            System.out.println("Remaining lives: "+ c2.getRemaning());
            System.out.println("Colour: "+ c2.getColour());
            System.out.println("Food: "+ c2.getFood());
            System.out.println("Number of legs: "+ c2.getNofLegs());
        }
        
        //loop with more than one animal;
        
        System.out.print("How many dogs do you want to input");
        int num = scn.nextInt();
        ExceptionHandling e = new ExceptionHandling();
        for(int x = 0; x<num; x++){
            Dog d2 = new Dog();
            boolean result;
            
            
            System.out.println("Name: ");
            String name = scn.next();
            result =e.StringHandling(name, 3);
            while(result == false){
                System.out.println("Name: ");
                name = scn.next();
                result =e.StringHandling(name, 3);
            }
            d2.setName(name);
        
            System.out.println("Breed: ");
            String breed = scn.next();
            result= e.StringHandling(breed, 4);
            while(result == false){
                System.out.println("Breed: ");
                breed = scn.next();
                result =e.StringHandling(breed, 4);
            }
            d2.setBreed(breed);
            
            System.out.println("Colour: ");
            String colour = scn.next();
            result = e.StringHandling(colour, 3);
            while(result == false){
                System.out.println("Colour: ");
                colour = scn.next();
                result =e.StringHandling(colour, 3);
            }
            d2.setColour(colour);
            
            System.out.println("Food: ");
            String food = scn.next();
            result = e.StringHandling(food, 4);
            while(result == false){
                System.out.println("Food: ");
                food = scn.next();
                result =e.StringHandling(food, 4);
            }
            d2.setFood(food);
            
            System.out.println("Number of legs: ");
            int legs = scn.nextInt();
            result = e.IntHandling(legs,4);
            while(result == false){
                System.out.println("Number of legs: ");
                legs = scn.nextInt();
                result = e.IntHandling(legs,4);
            }
            d2.setNofLegs(legs);
            
            //add dog to arrayList
            arrDog.add(d2);
        }
        
        
        for(int x = 0; x<arrDog.size();x++){
            Dog d2 = new Dog();
            d2 = (Dog)arrDog.get(x);
            System.out.println("Name: "+ d2.getName());
            System.out.println("Breed: "+ d2.getBreed());
            System.out.println("Colour: "+ d2.getColour());
            System.out.println("Food: "+ d2.getFood());
            System.out.println("Number of legs: "+ d2.getNofLegs());
        }
        
        //search
        
        System.out.print("Input the name of the dog you want to search: ");
        String search = scn.next();
        
        int pos = searchDog(arrDog, search);
        if(pos == -1){
            System.out.print("The dog doesn't exist!");
            
        }else if(pos>=0){
            Dog resultDog = new Dog();
            resultDog = (Dog)arrDog.get(pos);
            System.out.println("Breed: "+ resultDog.getBreed());
            System.out.println("Colour: "+ resultDog.getColour());
            System.out.println("Food: "+ resultDog.getFood());
            System.out.println("Number of legs: "+ resultDog.getNofLegs());
        }
        // boolean b = true;
       // for(int x = 0; x<arrDog.size(); x++){
           // Dog s = new Dog();
           // s = (Dog)arrDog.get(x);
           
           // if(s.getName().equalsIgnoreCase(search)){
               // System.out.println("Name: "+ s.getName());
            // System.out.println("Breed: "+ s.getBreed());
            // System.out.println("Colour: "+ s.getColour());
            // System.out.println("Food: "+ s.getFood());
            // System.out.println("Number of legs: "+ s.getNofLegs());
            // b = true;
            // }else{
                // b = false;
            // }
           
        // }
        
        // if(b == false){
            // System.out.print("The name doesn't exist");
        // }
        
        //adding person
        
       
        ArrayList people = new ArrayList();
        System.out.print("How many people do you want to add? ");
        int nPeople = scn.nextInt();
        for(int x = 0; x<nPeople; x++){
        Person p = new Person();
        System.out.println("Input the person details");
        System.out.println("Name: ");
        p.setName(scn.next());
        
        System.out.print("Age: ");
        int personAge = scn.nextInt();
        // boolean result = e.IntHandling(personAge,0);
        // while(result == false){
                // System.out.println("Number of legs: ");
                // personAge = scn.nextInt();
                // result = e.IntMin(personAge,0);
        // }
            p.setAge(personAge);
            
        System.out.println("Input the person's id: ");
        p.setId(scn.nextInt());
            
        System.out.println("Gender: ");
        p.setGender(scn.next().charAt(0));
        people.add(p);
        }     
        
        for(int x = 0; x<people.size(); x++){
            Person p = new Person();
            p = (Person)people.get(x);
            
            System.out.println("Person n." +(x+1));
            System.out.println("Name: "+p.getName());
            System.out.println("Gender: "+p.getGender());
            System.out.println("Id: "+p.getId());
            
            }
        //sorting the people by id
        
        sortList so = new sortList();
        so.sort(people, 0, (nPeople-1));
        for(int x = 0; x<people.size(); x++){
            Person p = new Person();
            p = (Person)people.get(x);
            
            System.out.println("Person n." +(x+1));
            System.out.println("Name: "+p.getName());
            System.out.println("Gender: "+p.getGender());
            System.out.println("Id: "+p.getId());
            
            }
        //ask for how many dogs
        
        System.out.print("Input how many dogs you want to add");
        int numbDogs = scn.nextInt();
        
        for(int x = 0; x<num; x++){
            Dog d2 = new Dog();
            boolean result2;
            
            
            System.out.println("Name: ");
            String name = scn.next();
            result2 =e.StringHandling(name, 4);
            while(result2 == false){
                System.out.println("Name: ");
                name = scn.next();
                result2 =e.StringHandling(name, 4);
            }
            d2.setName(name);
        
            System.out.println("Breed: ");
            String breed = scn.next();
            result2= e.StringHandling(breed, 4);
            while(result2 == false){
                System.out.println("Breed: ");
                breed = scn.next();
                result2 =e.StringHandling(breed, 4);
            }
            d2.setBreed(breed);
            
            System.out.println("Colour: ");
            String colour = scn.next();
            result2 = e.StringHandling(colour, 4);
            while(result2 == false){
                System.out.println("Colour: ");
                colour = scn.next();
                result2 =e.StringHandling(colour, 4);
            }
            d2.setColour(colour);
            
            System.out.println("Food: ");
            String food = scn.next();
            result2 = e.StringHandling(food, 4);
            while(result2 == false){
                System.out.println("Food: ");
                food = scn.next();
                result2 =e.StringHandling(food, 4);
            }
            d2.setFood(food);
            
            System.out.println("Number of legs: ");
            int legs = scn.nextInt();
            result2 = e.IntHandling(legs,4);
            while(result2 == false){
                System.out.println("Number of legs: ");
                legs = scn.nextInt();
                result2= e.IntHandling(legs,4);
            }
            d2.setNofLegs(legs);
            
            //add dog to arrayList
            ArrayList personDog = new ArrayList();
            personDog.add(d2);
            // p.setDog(personDog);
        }
        
        // System.out.print("Person details");
        // System.out.print("Name: " + p.getName());
        // System.out.print("Gender : " + p.getGender());
        // System.out.print("Age: "+p.getAge());
        
        // System.out.print("Those are "+p.getName()+"'s dogs");
        
        // for(int x = 0; x<p.getDog().size();x++){
            // Dog d2 = new Dog();
            // d2 = (Dog)p.getDog().get(x);
            // System.out.println("Name: "+ d2.getName());
            // System.out.println("Breed: "+ d2.getBreed());
            // System.out.println("Colour: "+ d2.getColour());
            // System.out.println("Food: "+ d2.getFood());
            // System.out.println("Number of legs: "+ d2.getNofLegs());
        // }
        
    }
    
    public static int searchDog(ArrayList dog, String search){
        int y = -1;
        for(int x = 0; x<dog.size(); x++){
            Dog d = new Dog();
            d = (Dog)dog.get(x);
            if(d.getName().equalsIgnoreCase(search)){
               y = x;
            }
        }
        return y;
    }
}
