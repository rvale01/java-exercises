
/**
 * Abstract class Property - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Property
{
    private int id;
    private String type;
    private String address;

    public Property(){
        id = 0;
        type="";
        address="";
    }

    public Property(int id, String type, String address){
        this.id = id;
        this.type = type;
        this.address = address;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getId(){
        return id;
    }

    public String getType(){
        return type;
    }

    public String getAddress(){
        return address;
    }

    public abstract double calculate();
}
