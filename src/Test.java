import java.io.File;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {


        File file = Math.file("numbers.txt");
        
        Math.map(file);
    }
}