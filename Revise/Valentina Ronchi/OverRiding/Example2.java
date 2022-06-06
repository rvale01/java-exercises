
/**
 * Write a description of class Example2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * write a programm for an account. This bank has three types of accounts. Each with different interest rate.
 * Account 1: 8%
 * Account 2: 4%
 * Account 3: 9%
 * Create three instances in the main 
 * Add an attrb. to show the name of the account; Add a method in the superclass called return Account name. 
 * Override this method
 */
public class Example2
{
    public static void main(String args[]){
        Account1 a1 = new Account1();
        int rate1 = a1.getIntRate();
        System.out.println("The interest rate of the "+a1.returnAccountName()+" is "+ rate1 + " %");
        
        Account2 a2 = new Account2();
        int rate2 = a2.getIntRate();
        System.out.println("The interest rate of the "+a2.returnAccountName()+" is "+ rate2 + " %");
        
        Account3 a3 = new Account3();
        int rate3 = a3.getIntRate();
        System.out.println("The interest rate of the "+a3.returnAccountName()+" is "+ rate3 + " %");
        
        Account a4 = new Account1();
        int rate4 = a4.getIntRate();
        System.out.println("The interest rate of the "+a4.returnAccountName()+" is "+rate4 + " %");
        
    }
}

class Account{
    String accountName;
    public int getIntRate(){
        return 2;
    }
    
    public String returnAccountName(){
        return accountName;
    }
    
}

class Account1 extends Account{
    public int getIntRate(){
        return 8;
    }
    
    public String returnAccountName(){
        return "Account1";
    }
}

class Account2 extends Account{
    public int getIntRate(){
        return 4;
    }
    
    public String returnAccountName(){
        return "Account2";
    }
}

class Account3 extends Account{
    public int getIntRate(){
        return 9;
    }
    
    public String returnAccountName(){
        return "Account3";
    }
}
