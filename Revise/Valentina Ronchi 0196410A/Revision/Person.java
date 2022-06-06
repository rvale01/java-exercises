import java.util.*;
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int id;
    private int age;
    private char gender;
    private ArrayList dog = new ArrayList();
    
    public Person(){
        name = "";
        age = 0;
        gender = ' ';
        dog = null;
        id = 0;
    }
    
    public Person(String name, int age, char gender, ArrayList dog, int id){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dog = dog;
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setGender(char gender){
        this.gender = gender;
    }
    
    public void setDog(ArrayList dog){
        this.dog = dog;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public int getId(){
        return id;
    }
    
    public char getGender(){
        return gender;
    }
    
    public ArrayList getDog(){
        return dog;
    }
}
