
/**
 * Write a description of class carClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * in the main create three object with the following informations:
 *
 * 
 */
public class Car
{
  int nofDoors;
  int bhp;
  String carBrand;
  double engine;
  boolean ac;
  
  public void setDoors(int doorsIn){
      nofDoors = doorsIn;
    }
  public int getDoors(){
      return nofDoors;
    }
    
  public void setBhp(int bhpIn){
      bhp = bhpIn;
    }
  public int getBhp(){
      return bhp;
    }
    
  public void setBrand(String brandIn){
      carBrand = brandIn;
    }
  public String getBrand(){
      return carBrand;
    }
    
  public void setEngine(double engineIn){
      engine = engineIn;
    }
  public double getEngine(){
      return engine;
    }
    
  public void setAc(boolean acIn){
       ac = acIn;
    }
  public boolean getAc(){
        return ac;
    }
  
  
    
}
