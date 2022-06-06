import java.util.*;
/**
 * Write a description of class UsingStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UsingStack
{
    public static void main(String rags[]){
        Stack st = new Stack();
        st.push(34);
        st.push(23);
        st.push("Hey");
        st.push("new");
        
        for(int x = st.size(); x>0;x--){
           System.out.println(st.pop());
        }
        // Queue q  ;
        // q.add(4);
         // System.out.println(q.poll());
         
    }
    
    
}
