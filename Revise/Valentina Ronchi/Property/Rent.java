
/**
 * Write a description of class Rent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rent extends Property
{
    double monRent;
    public Rent(){
        super();
        monRent = 0.0;
    }
    
    public Rent(int id, String type, String address, double monRent){
        super(id, type, address);
        this.monRent = monRent;
    }
    
    public void setMonRent(double monRent){
        this.monRent= monRent;
    }
    
    public double getMonRent(){
        return monRent;
    }
    
    public double calculate(){
        // 5% on the rent
        return 0.5*monRent;
    }
}
