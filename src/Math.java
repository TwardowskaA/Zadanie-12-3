import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class Math {

    public static File file(String name) {
        File file = new File(name);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }


    public static void map(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (scan.hasNextInt()) {
            int x = scan.nextInt();
            if (map.containsKey(x)) {
                int i = map.get(x);
                map.put(x, i + 1);
            } else {
                map.get(1);
            }

            }

        }

    }