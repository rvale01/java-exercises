
/**
 * Write a description of class Member here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Member 
{
    
    private String name;
    private String surname; 
    private int mobile;
    private String memberNumber;
    
    public Member(){
        name = "";
        surname = "";
        mobile = 0;
        memberNumber = "";
    }
    
    public Member(String name, String surname, int mobile, String memberNumber){
        this.name = name;
        this.surname= surname;
        this.mobile = mobile;
        this.memberNumber=memberNumber;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setMobile(int mobile){
        this.mobile = mobile;
    }
    
    public void setMemberNumber(String memberNumber){
        this.memberNumber = memberNumber;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public int getMobile(){
        return mobile;
    }
    
    public String getMemberNumber(){
        return memberNumber;
    }
    
    public String toString(){
        return "Name: "+ this.name + "\nSurname:"+surname+"\nMobile: "+ mobile+"\nMembership number: "+ memberNumber; 
    }
    
    public abstract double calcMembership();
}
