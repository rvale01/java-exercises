
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort
{
    public static void main(String args[]){
        sortArray();
    }
    public static void sortArray(){
       int[] arr = {10,5,32,65,1,23,0};
        for(int x = 0; x<(arr.length); x++){
            for(int y = 1; y<(arr.length-x); y++){
                if(arr[y]<arr[y-1]){
                    int temp = arr[y];
                    arr[y] = arr[y-1];
                    arr[y-1] = temp;
                }
            }
        }
        
        for(int x = 0; x<arr.length;x++){
            System.out.println(arr[x]);
        }
        // return arr;
    }
}
