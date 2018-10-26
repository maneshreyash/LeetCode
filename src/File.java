import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class File {

    public static void main(String[] args) {

        HashMap<String, Integer> host = new HashMap<>();

        try {
            FileReader reader = new FileReader(args[0]);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] input = line.split(" -");
                host.put(input[0], host.getOrDefault(input[0], 0) + 1);
            }
            reader.close();
            FileWriter writer = new FileWriter(args[1]);
            for(Map.Entry<String, Integer> entry : host.entrySet())
            {
                writer.write(entry.getKey() + " " + entry.getValue() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
