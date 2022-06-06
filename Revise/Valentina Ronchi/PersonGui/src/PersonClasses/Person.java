/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonClasses;

import java.util.Date;

/**
 *
 * @author SECPC106
 */
public class Person {
    private String name;
    private String surname;
    private Date dob;
    private String address;
    private int mobile;
    private int id;
    private String email;
 
    public Person(String nameIn, String surnameIn, Date dobIn, String addressIn,int mobileIn, int idIn, String emailIn){
         name = nameIn;
         surname= surnameIn;
         dob = dobIn;
         address = addressIn;
         mobile = mobileIn;
         id = idIn;
         email = emailIn;
         
    }
    
    public Person(){
          name = "";
         surname= "";
         dob = null;
         address = "";
         mobile = 0;  
         id = 0;
         email = "";
}

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public Date getDob(){
        return dob;
    }
    public String getAddress(){
        return address;
    }
    public int getMobile(){
        return mobile;
    }
    public int getId(){
    return id;
    }
    public String getEmail(){
        return email;
    }
    
    public void setName(String nameIn){
    name = nameIn;
    }
    public void setSurname(String surnameIn){
        surname = surnameIn;
    }
    public void setDob(Date dobIn){
        dob = dobIn;
    }
    public void setAddress(String addressIn){
        address = addressIn;
    }
    public void setMobile(int mobileIn){
        mobile = mobileIn;
    }
    public void setId(int idIn){
        id = idIn;
    }
    public void setEmail(String emailIn){
        email = emailIn;
    }
}