
/**
 * Write a description of class Names2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Change the program, instead of printing one word, we'll print 10 words
 */
public class Names2
{
    public static void main(String args[]){
       int y = 1;
        for(int x= 0;x<10;x++){
            
          String sta = "";
        
           for(int i = 0; i<=5; i++){
            char c = (char)(Math.random()*(90-65)+65);
            sta = sta + c;
            }
            System.out.print(y+":\t"+sta+"\n");
            y++;
          }
        }
    }
    
