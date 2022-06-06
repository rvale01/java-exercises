import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 * Write a description of class SaveToFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SaveToFile
{
    private String path = "./test2";
    private boolean append_to_file = false;

    public SaveToFile(String path){
        this.path = path;
    }

    public SaveToFile(String path, boolean append_to_file){
        this.path = path;
        this.append_to_file = append_to_file;
    }

    public void writeToFile( String textLine ) throws IOException {
        FileWriter write = new FileWriter( path , append_to_file);
        PrintWriter print_line = new PrintWriter( write );
        print_line.printf( "%s" + "%n" , textLine);
        print_line.close();
    }
}
