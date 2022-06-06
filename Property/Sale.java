
/**
 * Write a description of class Sale here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sale extends Property
{
    private double price;
    
    public Sale(){
        super();
        price = 0.0;
    }
    
    public Sale(int id, String type, String address, double price){
        super(id, type, address);
        this.price = price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double calculate(){
        return 0.05*price;
    }
}
