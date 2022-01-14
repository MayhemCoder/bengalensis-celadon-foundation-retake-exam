package worstSongs;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WorstSongs {

    public static void main(String[] args) throws IOException {
        System.out.println(worstYearInMusic("src/worstSongs/100worst.csv"));
    }

    public static int worstYearInMusic(String filename) {
        HashMap<Integer, Integer> map = new HashMap<>();
        try {
            Path path = Paths.get(filename);
            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {
                int year = Integer.parseInt(line.split(";")[3]);
                if (map.containsKey(year)) {
                    int count = map.get(year);
                    map.replace(year, count + 1);
                } else {
                    map.put(year, 1);
                }
            }

            int key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            return key;

        } catch (FileNotFoundException e) {
            System.out.println("File not exists");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return -1;

    }
}
