import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Menu");
        boolean b = true;

        ArrayList<Sale> sales = new ArrayList<Sale>();
        ArrayList<Rent> rent = new ArrayList<Rent>();
        ArrayList<ShortRent> shortRent = new ArrayList<ShortRent>();
        do{
            System.out.print("1.Add Sale");
            System.out.print("2.Add Rent");
            System.out.print("3.Add Short Rent");
            System.out.print("4.Display Sale");
            System.out.print("5.Display Rent");
            System.out.print("6.Display Short Rent");
            System.out.print("7.Search Sale");
            System.out.print("8.Search Rent");
            System.out.print("9.Search Short Rent");

            System.out.print("10.Exit");

            int option = scn.nextInt();
            switch(option){
                case 1: sales = addSale(sales);break;
                case 2: rent = addRent(rent);break;
                case 3: shortRent = addShortRent(shortRent);break;
                case 4: displaySale(sales);break;
                case 5: displayRent(rent);break;
                case 6: displayShortRent(shortRent);break;
                case 7: searchSale(sales);break;
                case 8: searchRent(rent);break;
                case 9: searchShortRent(shortRent);break;
                case 10 : b = false; break;
            }

        }while(b == true);
    }

    public static ArrayList<Sale> addSale(ArrayList<Sale> sales){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many properties on sale do you want to add? ");
        int n = scn.nextInt();
        for(int x = 0; x< n; x++){
            Sale s = new Sale();
            System.out.println("Input n. "+(x+1));
            System.out.println("Id: ");
            int id = scn.nextInt();
            s.setId(id);

            System.out.println("Type: ");
            String type = scn.next();
            s.setType(type);

            System.out.println("Address: ");
            String address = scn.next();
            s.setAddress(address);

            System.out.println("Price: ");
            double price= scn.nextDouble();
            s.setPrice(price);

            sales.add(s);
        }

        return sales;
    }

    public static ArrayList<Rent> addRent(ArrayList<Rent> rent){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many properties for rent do you want to add? ");
        int n = scn.nextInt();
        for(int x = 0; x< n; x++){
            Rent r = new Rent();
            System.out.println("Input n. "+(x+1));
            System.out.println("Id: ");
            int id = scn.nextInt();
            r.setId(id);

            System.out.println("Type: ");
            String type = scn.next();
            r.setType(type);

            System.out.println("Address: ");
            String address = scn.next();
            r.setAddress(address);

            System.out.println("Monthly rent: ");
            double monRent= scn.nextDouble();
            r.setMonRent(monRent);

            rent.add(r);
        }

        return rent;
    }

    public static ArrayList<ShortRent> addShortRent(ArrayList<ShortRent> shortRent){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many properties for short rent do you want to add? ");
        int n = scn.nextInt();
        for(int x = 0; x< n; x++){
            ShortRent r = new ShortRent();
            System.out.println("Input n. "+(x+1));
            System.out.println("Id: ");
            int id = scn.nextInt();
            r.setId(id);

            System.out.println("Type: ");
            String type = scn.next();
            r.setType(type);

            System.out.println("Address: ");
            String address = scn.next();
            r.setAddress(address);

            System.out.println("Daily rent: ");
            double dayRent= scn.nextDouble();
            r.setMonRent(dayRent);

            shortRent.add(r);
        }

        return shortRent;
    }

    public static void displaySale(ArrayList<Sale> sales){
        for(Sale r : sales){
            System.out.println("Id: "+r.getId());
            System.out.println("Type: "+r.getType());
            System.out.println("Address: "+r.getAddress());
            System.out.println("Price: "+r.getPrice()+"\n");
        }
    }

    public static void displayRent(ArrayList<Rent> rent){
        for(Rent r : rent){
            System.out.println("Id: "+r.getId());
            System.out.println("Type: "+r.getType());
            System.out.println("Address: "+r.getAddress());
            System.out.println("Monthly rent: "+r.getMonRent()+"\n");
        }
    }

    public static void displayShortRent(ArrayList<ShortRent> shortRent){
        for(ShortRent sr:shortRent ){
            System.out.println("Id: "+ sr.getId());
            System.out.println("Type: "+ sr.getType());
            System.out.println("Address: "+sr.getAddress());
            System.out.println("Daily rent: "+sr.getDayRent()+"\n");
        }
    }

    public static void searchSale(ArrayList<Sale> sales){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the id you are looking for: ");
        int id = scn.nextInt();
        boolean b = false;
        for(Sale s: sales){
            if(s.getId() == id){
                System.out.println("Id: "+s.getId());
                System.out.println("Type: "+s.getType());
                System.out.println("Address: "+s.getAddress());
                System.out.println("Price: "+s.getPrice()+"\n");
                b = true;
            }
        }
        if(b == false){
            System.out.println("The id was not found!");
        }
    }

    public static void searchRent(ArrayList<Rent> rent){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the id you are looking for");
        int id = scn.nextInt();
        boolean b = false;
        for(Rent r : rent){
            if(r.getId()==id){
                System.out.println("Id: "+r.getId());
                System.out.println("Type: "+r.getType());
                System.out.println("Address: "+r.getAddress());
                System.out.println("Monthly rent: "+r.getMonRent()+"\n");
                b = true;
            }
        }
        if(b == false){
            System.out.println("The id was not found!");
        }
    }
    
    public static void searchShortRent(ArrayList<ShortRent> shortRent){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the id you are looking for");
        int id = scn.nextInt();
        boolean b = false;
        for(ShortRent sr : shortRent){
            if(sr.getId()==id){
                System.out.println("Id: "+sr.getId());
                System.out.println("Type: "+sr.getType());
                System.out.println("Address: "+sr.getAddress());
                System.out.println("Daily: "+sr.getDayRent()+"\n");
                b = true;
            }
        }
        if(b == false){
            System.out.println("The id was not found!");
        }
    }
}
