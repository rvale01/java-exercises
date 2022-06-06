import java.util.*;
import java.io.IOException;
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
            System.out.println("1.Add Sale");
            System.out.println("2.Add Rent");
            System.out.println("3.Add Short Rent");
            System.out.println("4.Display Sale");
            System.out.println("5.Display Rent");
            System.out.println("6.Display Short Rent");
            System.out.println("7.Search Sale");
            System.out.println("8.Search Rent");
            System.out.println("9.Search Short Rent");
            System.out.println("10.Search anything by id ");
            System.out.println("11.Search anything by type ");
            System.out.println("12.Edit sale");
            System.out.println("13. Edit rent");
            System.out.println("14.Edit short rent");
            System.out.println("15.Delete sales by id");
            System.out.println("16.Delete rent by id");
            System.out.println("17.Delete shortRent by id");
            System.out.println("18.Sort sales");
            System.out.println("19.Sort rent");
            System.out.println("20.Sort short rent");
            System.out.println("21.Exit");

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
                case 10: searchById(sales,rent,shortRent);break;
                case 11:searchByValue(sales,rent,shortRent);break;
                case 12: sales = editSale(sales);break;
                case 13: rent = editRent(rent);break;
                case 14: shortRent = editShortRent(shortRent);break;
                case 15: sales = deleteSale(sales);break;
                case 16: rent = deleteRent(rent);break;
                case 17:shortRent = deleteShortRent(shortRent);break;
                case 18: sales = sortSale(sales);break;
                case 19: rent = sortRent(rent);break;
                case 20: shortRent = sortShortRent(shortRent);break;
                case 21 : b = false; break;
            }

        }while(b == true);

        saveToFile(sales);
        saveToFileRent(rent);
        saveToFileShortRent(shortRent);
    }

    public static void saveToFileShortRent(ArrayList<ShortRent> shortRent){
        try{
            SaveToFile sf = new SaveToFile("./test2.txt", true);
            for(int x = 0; x<shortRent.size(); x++){
                ShortRent sr = new ShortRent();
                sr = (ShortRent)shortRent.get(x);

                String s ="--ShortRent n."+(x+1)+"-- \r\n"+"Id: "+sr.getId()+"\r\nType: "+sr.getType()+"\r\nAddress: "+sr.getAddress()+"\r\nDaily: "+sr.getDayRent()+"\r\n\r\n\r\n";
                sf.writeToFile(s);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage() );
        }

        System.out.println( "Text File Written To" );
    }

    public static void saveToFile(ArrayList<Sale> sale){
        try{
            SaveToFile sf = new SaveToFile("./test2.txt", true);
            for(int x = 0; x<sale.size(); x++){
                Sale s2 = new Sale();
                s2 = (Sale)sale.get(x);

                String s = "--Sales n."+(x+1)+"-- \r\n"+"Id: "+s2.getId()+"\r\nType: "+s2.getType()+"\r\nAddress: "+s2.getAddress()+"\r\nPrice: "+s2.getPrice()+"\r\n\r\n\r\n";
                sf.writeToFile(s);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage() );
        }

        System.out.println( "Text File Written To" );
    }

    public static void saveToFileRent(ArrayList<Rent> rent){
        try{
            SaveToFile sf = new SaveToFile("./test2.txt", true);
            for(int x = 0; x<rent.size(); x++){
                Rent r = new Rent();
                r = (Rent)rent.get(x);
                String s = "--Rent n."+(x+1)+"-- \r\n"+"Id: "+r.getId()+"\r\nType: "+r.getType()+"\r\nAddress: "+r.getAddress()+"\r\nMonthly rent: "+r.getMonRent()+"\n"+"\r\n\r\n\r\n";
                sf.writeToFile(s);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage() );
        }

        System.out.println( "Text File Written To" );
    }

    public static ArrayList<Sale> sortSale(ArrayList<Sale> sale){
        Sort s = new Sort();
        s.sortSale(sale, 0, (sale.size()-1));
        return sale;
    }

    public static ArrayList<Rent> sortRent(ArrayList<Rent> rent){
        Sort s = new Sort();
        s.sortSale(rent, 0, (rent.size()-1));
        return rent;
    }

    public static ArrayList<ShortRent> sortShortRent(ArrayList<ShortRent> shortRent){
        Sort s = new Sort();
        s.sortSale(shortRent, 0, (shortRent.size()-1));
        return shortRent;
    }

    public static ArrayList<Sale> deleteSale(ArrayList<Sale> sale){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the id of the property you want to delete: ");
        int id = scn.nextInt();

        Search s = new Search();
        int pos = s.searchIdSale(sale, id);

        sale.remove(pos);
        return sale;
    }

    public static ArrayList<Rent> deleteRent(ArrayList<Rent> rent){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the id of the property you want to delete: ");
        int id = scn.nextInt();

        Search s = new Search();
        int pos = s.searchIdSale(rent, id);
        return rent;
    }

    public static ArrayList<ShortRent> deleteShortRent(ArrayList<ShortRent> shortRent){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the id of the property you want to delete: ");
        int id = scn.nextInt();

        Search s = new Search();
        int pos = s.searchIdSale(shortRent, id);
        return shortRent;
    }

    public static ArrayList<ShortRent> editShortRent(ArrayList<ShortRent> shortRent){
        Search s = new Search();
        Scanner scn = new Scanner(System.in);

        System.out.println("Search the id of the shortRent you want to edit: ");
        int id = scn.nextInt();

        int pos = s.searchIdSale(shortRent, id);
        if(pos != -1){

            System.out.println("--Edit property: --");

            ShortRent sr = new ShortRent();
            sr = shortRent.get(pos);

            System.out.println("--ShortRent--");
            System.out.println("Id: "+sr.getId());
            System.out.println("Type: "+sr.getType());
            System.out.println("Address: "+sr.getAddress());
            System.out.println("Daily: "+sr.getDayRent()+"\n");

            System.out.println("Edit the sale: ");

            System.out.println("Id: ");
            id = scn.nextInt();
            sr.setId(id);

            System.out.println("Type: ");
            String type = scn.next();
            sr.setType(type);

            System.out.println("Address: ");
            String address = scn.next();
            sr.setAddress(address);

            System.out.println("Daily rent: ");
            double dayRent= scn.nextDouble();
            sr.setMonRent(dayRent);
            shortRent.set(pos,sr);
        }
        else{
            System.out.println("The property you were looking for doesn't exist.");
        }
        return shortRent;
    }

    public static ArrayList<Rent> editRent(ArrayList<Rent> rent){
        Search s = new Search();
        Scanner scn = new Scanner(System.in);

        System.out.println("Search the id of the rent you want to edit: ");
        int id = scn.nextInt();

        int pos = s.searchIdSale(rent, id);
        if(pos!=-1){
            System.out.println("--Edit property: --");

            Rent r = new Rent();
            r = rent.get(pos);

            System.out.println("--Rent--");
            System.out.println("Id: "+r.getId());
            System.out.println("Type: "+r.getType());
            System.out.println("Address: "+r.getAddress());
            System.out.println("Monthly rent: "+r.getMonRent()+"\n");

            System.out.println("Edit the sale: ");

            System.out.println("Id: ");
            id = scn.nextInt();
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

            rent.set(pos,r);
        }else{
            System.out.println("The property you were looking for doesn't exist");
        }
        return rent;
    }

    public static ArrayList<Sale> editSale(ArrayList<Sale> sale){
        Search s = new Search();
        Scanner scn = new Scanner(System.in);

        System.out.println("Search the id of the sale you want to edit: ");
        int id = scn.nextInt();

        int pos = s.searchIdSale(sale, id);
        if(pos !=-1){

            System.out.println("--Edit property: --");

            Sale s2 = new Sale();
            s2 = (Sale)sale.get(pos);

            System.out.println("--Sales--");
            System.out.println("Id: "+s2.getId());
            System.out.println("Type: "+s2.getType());
            System.out.println("Address: "+s2.getAddress());
            System.out.println("Price: "+s2.getPrice()+"\n");

            System.out.println("Edit the sale: ");

            System.out.println("Id: ");
            id = scn.nextInt();
            s2.setId(id);

            System.out.println("Type: ");
            String type = scn.next();
            s2.setType(type);

            System.out.println("Address: ");
            String address = scn.next();
            s2.setAddress(address);

            System.out.println("Price: ");
            double price= scn.nextDouble();
            s2.setPrice(price);

            sale.set(pos,s2);
        }else{
            System.out.println("The property you were looking for doesn't not exist");
        }
        return sale;
    }

    public static void searchByValue(ArrayList<Sale> sales, ArrayList<Rent> rent,ArrayList<ShortRent> shortRent){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the type of property you are looking for");
        String type= scn.next();
        ArrayList result = new ArrayList();
        ArrayList a = new ArrayList();

        Search s = new Search();
        a.addAll(sales);
        a.addAll(rent);
        a.addAll(shortRent);

        result = s.searchByType(a, type);
        if(result.isEmpty()){
            System.out.println("There isn't any value that matches yours");
        }else{
            for(int x = 0; x<result.size(); x++){
                if(result.get(x) instanceof Sale){
                    Sale sales2 = new Sale();
                    sales2 = (Sale)result.get(x);
                    System.out.println("--Sales--");
                    System.out.println("Id: "+sales2.getId());
                    System.out.println("Type: "+sales2.getType());
                    System.out.println("Address: "+sales2.getAddress());
                    System.out.println("Price: "+sales2.getPrice()+"\n");
                }else if(result.get(x) instanceof Rent){
                    Rent rent2 = new Rent();
                    rent2 = (Rent)result.get(x);
                    System.out.println("--Rent--");
                    System.out.println("Id: "+rent2.getId());
                    System.out.println("Type: "+rent2.getType());
                    System.out.println("Address: "+rent2.getAddress());
                    System.out.println("Monthly rent: "+rent2.getMonRent()+"\n");
                }else if(result.get(x) instanceof ShortRent){
                    ShortRent shortRent2 = new ShortRent();
                    shortRent2 = (ShortRent)result.get(x);
                    System.out.println("--ShortRent--");
                    System.out.println("Id: "+shortRent2.getId());
                    System.out.println("Type: "+shortRent2.getType());
                    System.out.println("Address: "+shortRent2.getAddress());
                    System.out.println("Daily: "+shortRent2.getDayRent()+"\n");
                }
            }
        }
    }

    public static void searchById(ArrayList<Sale> sales, ArrayList<Rent> rent,ArrayList<ShortRent> shortRent){
        ArrayList arr = new ArrayList();
        Scanner scn = new Scanner(System.in);
        arr.addAll(rent);
        arr.addAll(shortRent);
        arr.addAll(sales);
        System.out.println("Input the id you want to search:");
        int id = scn.nextInt();

        Search s = new Search();
        int pos = s.searchIdSale(arr, id);
        if(pos == -1){
            System.out.println("The item was not found");
        }else{
            System.out.println("The item was found!");
        }
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
