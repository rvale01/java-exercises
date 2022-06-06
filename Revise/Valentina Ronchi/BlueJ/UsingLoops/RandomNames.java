
/**
 * Write a description of class RandomNames here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * generate five random letters and output them.
 */
public class RandomNames
{
    public static void main(String args[]){
        
        String sta = "";
        
        for(int i = 0; i<=5; i++){
            char c = (char)(Math.random()*(90-65)+65);
            sta = sta + c;
            }
            System.out.print(sta);
        }
}
