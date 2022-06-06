
import java.util.*;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{

    public static void main (String args[]){
        Validation validation = new Validation();
        Scanner scn = new Scanner(System.in);
        System.out.println("How big does the array of Eletric Cars have to be?");
        int sizeElectric = validation.validateInt();
        ElectricCar[] ec = new ElectricCar[sizeElectric];

        System.out.println("How big does the array of Fuel Cars have to be?");
        int sizeFuel = scn.nextInt();
        FuelCar[] fc = new FuelCar[sizeFuel];
        boolean b = true;

        System.out.println("--Menu--");
        do{
            System.out.println("1. Add Electric Car");
            System.out.println("2. Add Fuel Car");
            System.out.println("3. Display Electric Car");
            System.out.println("4. Display Fuel Car");
            System.out.println("5. Search Electric Car");
            System.out.println("6. Search Fuel Car");
            System.out.println("7. Search both");
            System.out.println("8. Edit Electric");
            System.out.println("9. Edit Fuel");
            System.out.println("10. Exit");

            int option = validation.validateInt();

            switch(option){
                case 1: ec = addElectricCar(ec);break;
                case 2: fc = addFuelCar(fc);break;
                case 3: displayElectric(ec);break;
                case 4: displayFuel(fc);break;
                case 5: searchElectric(ec);break;
                case 6: searchFuel(fc);break;
                case 7: display(fc,ec);break;
                case 8: ec = editElctricCar(ec);break;
                case 9: fc = editFuel(fc);break;
                case 10: b = false;
            }

        }while(b == true);
    }

    public static ElectricCar[] addElectricCar(ElectricCar[] electricArray){
        Scanner scn = new Scanner(System.in);
        Validation validation = new Validation();
        for(int x = 0; x<electricArray.length; x++){
            ElectricCar electricCar = new ElectricCar();
            System.out.println("Model");
            electricCar.setModel(scn.next());

            System.out.println("Make");
            electricCar.setMake(scn.next());

            boolean b = true;
            int id;
            do{
                id = validId();
                for(int y = 0; y<x; y++){
                    b = true;
                    ElectricCar ec = new ElectricCar();
                    ec = (ElectricCar)electricArray[y];
                    if(id == ec.getId()){
                        System.out.println("The id already exist! Try again!");
                        b = false;
                    }
                }
            }while(b == false);
            electricCar.setId(id);

            System.out.println("Battery level");
            int battery = scn.nextInt();
            battery = validation.validateBatteryFuel();
            electricCar.setBatteryLevel(battery);
            System.out.println("");
            electricArray[x] = electricCar;
        }
        return electricArray;
    }

    public static FuelCar[] addFuelCar(FuelCar[] fuelArray){
        Scanner scn = new Scanner(System.in);
        for(int x = 0; x<fuelArray.length; x++){
            FuelCar fuelCar = new FuelCar();
            System.out.println("Model");
            fuelCar.setModel(scn.next());

            System.out.println("Make");
            fuelCar.setMake(scn.next());

            boolean b = true;
            int id;
            do{ 
                id = validId();
                b = true;
                for(int y = 0; y<x; y++){

                    FuelCar fc = new FuelCar();
                    fc = (FuelCar)fuelArray[y];
                    if(id == fc.getId()){
                        System.out.println("The id already exist! Try again!");
                        b =false;
                    }
                }
            }while(b ==false);

            fuelCar.setId(id);

            System.out.println("Fuel level");
            fuelCar.setFuelLevel(scn.nextInt());
            System.out.println("");
            fuelArray[x] = fuelCar;
        }
        return fuelArray;
    }

    public static void displayElectric(ElectricCar[] electricArray){
        try{
            for(int x = 0; x<electricArray.length; x++){
                ElectricCar electric = new ElectricCar();
                electric = (ElectricCar)electricArray[x];
                System.out.println("Car n. " +(x+1));
                System.out.println("Model: " + electric.getModel());
                System.out.println("Make: " + electric.getMake());
                System.out.println("Id: " + electric.getId());
                System.out.println("Battery Level: " + electric.getBatteryLevel());
                System.out.println("");
            }
        }catch(NullPointerException e){
            System.out.println("The array is empty!");
        }
    }

    public static void displayFuel(FuelCar[] fuelArray){
        try{
            for(int x = 0; x<fuelArray.length; x++){
                FuelCar fuel = new FuelCar();
                fuel = (FuelCar)fuelArray[x];
                System.out.println("Car n. " +(x+1));
                System.out.println("Model: " + fuel.getModel());
                System.out.println("Make: " + fuel.getMake());
                System.out.println("Id: " + fuel.getId());
                System.out.println("Fuel Level: " + fuel.getFuelLevel());
                System.out.println("");
            }
        }catch(NullPointerException e ){
            System.out.println("The array is empty");
        }
    }

    public static void searchElectric(ElectricCar[] electricArray){
        Validation validation = new Validation();
        try{
            Scanner scn = new Scanner(System.in);
            System.out.println("Input the id you want to search:");
            int id = validation.validateInt();
            boolean b = true;
            for(int x = 0; x<electricArray.length;x++){
                ElectricCar electric = new ElectricCar();
                electric = (ElectricCar)electricArray[x];

                if(electric.getId() == id){
                    System.out.println("Model: " + electric.getModel());
                    System.out.println("Make: " + electric.getMake());
                    System.out.println("Id: " + electric.getId());
                    System.out.println("Batter Level: " + electric.getBatteryLevel());
                    System.out.println("");
                    b = false;
                }
            }

            if(b == true){
                System.out.println("The id does not exist");
            }

        }catch(NullPointerException e){
            System.out.println("The array is empty!");
        }catch(InputMismatchException m){
            System.out.println("The value you inputted is wrong! Try again");
        }
    }

    public static void searchFuel(FuelCar[] fuelArray){
        try{
            Scanner scn = new Scanner(System.in);
            System.out.println("Input the id you want to search:");
            int id = scn.nextInt();
            boolean b = false;
            for(int x = 0; x<fuelArray.length;x++){
                FuelCar fuel = new FuelCar();
                fuel = (FuelCar)fuelArray[x];

                if(fuel.getId() == id){
                    System.out.println("Model: " + fuel.getModel());
                    System.out.println("Make: " + fuel.getMake());
                    System.out.println("Id: " + fuel.getId());
                    System.out.println("Batter Level: " + fuel.getFuelLevel());
                    System.out.println("");
                    b= true;
                }
            }
            if(b == false){
                System.out.println("The id does not exist");
            }
        }catch(NullPointerException e){
            System.out.println("The array is empty!");
        }
    }

    public static boolean searchElectric2(ElectricCar[] electricArray){
        try{
            Scanner scn = new Scanner(System.in);
            System.out.println("Input the id you want to search:");
            int id = scn.nextInt();

            for(int x = 0; x<electricArray.length;x++){
                ElectricCar electric = new ElectricCar();
                electric = (ElectricCar)electricArray[x];

                if(electric.getId() == id){
                    return true;
                }
            }
        }catch(NullPointerException e){
            System.out.println("The array is empty!");
        }
        return false;
    }

    public static int searchElectric(ElectricCar[] electricArray, int id){
        try{
            Scanner scn = new Scanner(System.in);
            for(int x = 0; x<electricArray.length; x++){
                ElectricCar ec = new ElectricCar();
                ec = (ElectricCar)electricArray[x];

                if(ec.getId()== id){
                    return x;
                }
            }
        }catch(NullPointerException e){
            System.out.println("The array is empty!");
        }
        return -1;
    }

    public static ElectricCar searchElectric3(ElectricCar[] electricArray){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the id you want to search");
        int id = scn.nextInt();

        try{
            for(int x = 0; x<electricArray.length;x++){
                ElectricCar electric = new ElectricCar();
                electric = (ElectricCar)electricArray[x];

                if(electric.getId() ==id){
                    return electric;
                }
            }
        }catch(NullPointerException e){
            System.out.println("The array is empy!");
        }

        return null;
    }

    public static int searchFuel2(FuelCar[] fuelArray, int id){
        try{
            for(int x = 0; x<fuelArray.length;x++){
                FuelCar fuel = new FuelCar();
                fuel = (FuelCar)fuelArray[x];

                if(fuel.getId() == id){
                    return x;
                }
            }
        }catch(NullPointerException e){
            System.out.println("The array is empty!");
        }

        return -1;
    }

    public static boolean searchFuel3(FuelCar[] fuelArray){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the id you are looking for: ");
        int id = scn.nextInt();

        for(int x = 0; x<fuelArray.length; x++){
            FuelCar fuel = new FuelCar();
            fuel = (FuelCar)fuelArray[x];

            if(fuel.getId() == id){
                return true;
            }
        }
        return false;

    }

    public static FuelCar searchFuel4(FuelCar[] fuelArray){
        try{
            Scanner scn = new Scanner(System.in);
            System.out.println("Input the id you are looking for: ");
            int id = scn.nextInt();

            for(int x = 0; x<fuelArray.length; x++){
                FuelCar fuel = new FuelCar();
                fuel = (FuelCar)fuelArray[x];

                if(fuel.getId() == id){
                    return fuel;
                }
            }
        }catch(NullPointerException e){
            System.out.println("The array is empty!");
        }
        return null;
    }

    public static void display(FuelCar [] fuelCar, ElectricCar[] electricCar){
        try{
            Scanner scn = new Scanner(System.in);
            FuelCar fuel1 = searchFuel4(fuelCar);
            if(fuel1==null){
                System.out.println("Not found!");
            }else{
                System.out.println("Found!");
            }

            boolean b = searchFuel3(fuelCar);
            if(b){
                System.out.println("The value was found!");
            }else{
                System.out.println("The value was not found!");
            }

            System.out.println("Input the id you want to look for: ");
            int id = scn.nextInt();
            int index = searchFuel2(fuelCar, id);
            if(index<0){
                System.out.println("Not Found");
            }else{
                System.out.println("Found");
            }

            ElectricCar car = searchElectric3(electricCar);
            if(fuel1==null){
                System.out.println("Not found!");
            }else{
                System.out.println("Found!");
            }

            boolean b2 = searchElectric2(electricCar);
            if(b){
                System.out.println("The value was found!");
            }else{
                System.out.println("The value was not found!");
            }

            System.out.println("Input the id you want to look for: ");
            int id2 = scn.nextInt();
            int index2 = searchElectric(electricCar, id2);
            if(index<0){
                System.out.println("Not Found");
            }else{
                System.out.println("Found");
            }
        }catch(NullPointerException e){
            System.out.println("The array is empty!");
        }
    }

    public static ElectricCar[] editElctricCar(ElectricCar[] electricArray){
        try{
            Scanner scn = new Scanner(System.in);
            ElectricCar ec = new ElectricCar();

            int id = validId();
            int index = searchElectric(electricArray, id);
            if(index == -1){
                System.out.println("The value was not found!");
                return electricArray;
            }else{
                ec = (ElectricCar)electricArray[index];

                System.out.println("1. Id");
                System.out.println("2. Model");
                System.out.println("3. Make");
                System.out.println("4. Battery Level");
                int option = scn.nextInt();

                switch(option){
                    case 1: {
                        boolean b = true;
                        do{ 
                            id = validId();
                            b = true;
                            for(int x = 0; x<electricArray.length; x++){
                                ElectricCar electric = new ElectricCar();
                                electric = (ElectricCar)electricArray[x];
                                if(electric.getId() == id){
                                    System.out.println("The id is not valid!");
                                    b = false;
                                }
                            }
                        }while(b == false);
                        ec.setId(id);
                    };break;
                    case 2: {
                        System.out.println("Model: ");
                        ec.setModel(scn.next());
                    };break;
                    case 3: {
                        System.out.println("Make: ");
                        ec.setMake(scn.next());
                    };break;
                    case 4:{
                        System.out.println("Battery level");
                        ec.setBatteryLevel(scn.nextInt());
                    }
                }

                electricArray[index] = ec;
                return electricArray;
            }
        }catch(NullPointerException e){
            System.out.println("The array is empty!");
            return null;
        }
    }

    public static FuelCar[] editFuel(FuelCar[] fuelArray){
        try{Scanner scn = new Scanner(System.in);
            int id = validId();
            int index = searchFuel2(fuelArray,id);
            if(index == -1){
                System.out.println("The input was not found!");
                return fuelArray;
            }else{
                FuelCar fc = new FuelCar();
                fc = (FuelCar)fuelArray[index];

                System.out.println("1. Id");
                System.out.println("2. Model");
                System.out.println("3. Make");
                System.out.println("4. Fuel Level");
                int option = scn.nextInt();

                switch(option){
                    case 1: {

                        boolean b = true;
                        do{
                            id = validId();
                            b = true;
                            for(int x = 0; x<fuelArray.length; x++){
                                FuelCar fuel = new FuelCar();
                                fuel = (FuelCar)fuelArray[x];
                                if(fuel.getId() == id){
                                    System.out.println("The id is not unique");
                                    b = false;
                                }
                            }
                        }while(b == false);
                    };break;
                    case 2:{
                        System.out.println("Model: ");
                        fc.setModel(scn.next());
                    };break;
                    case 3:{
                        System.out.println("Make: ");
                        fc.setMake(scn.next());
                    };break;
                    case 4:{
                        System.out.println("Fuel Level");
                        fc.setFuelLevel(scn.nextInt());
                    };break;
                }
                fuelArray[index] = fc;
                return fuelArray;
            }
        }catch(NullPointerException e){
            System.out.println("The array is empty!");
            return null;
        }
    }

    public static int validId(){
        boolean b = true;
        do{
            try{
                b = true;
                Scanner scn = new Scanner(System.in);
                System.out.println("Input the id: ");
                int id = scn.nextInt();
                return id;
            }catch(InputMismatchException e ){
                System.out.println("The input has to be a number!");
                b = false;
            }
        }while(b == false);
        return -1;
    }
}
