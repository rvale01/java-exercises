
/**
 * Write a description of class ShortRent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShortRent extends Rent
{
    double dayRent;
    
    public ShortRent(){
        super();
        dayRent = 0.0;
    }
    
    public ShortRent(int id, String type, String address,double monRent, double dayRent){
        super( id, type, address, monRent);
        this.dayRent = dayRent;
    }
    
    public void setDayRent(double dayRent){
        this.dayRent = dayRent;
    }
    
    public double getDayRent(){
        return dayRent;
    }
    
    public double calculate(){
        return 0.25*dayRent;
    }
}
