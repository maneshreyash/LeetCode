import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class File {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String filename;
        filename = scan.nextLine();
        HashMap<String, Integer> host = new HashMap<>();

        try {
            FileReader reader = new FileReader(filename);
            BufferedReader buff = new BufferedReader(reader);
            String line;
            while ((line = buff.readLine()) != null) {
                String[] input = line.split(" -");
                host.put(input[0], host.getOrDefault(input[0], 0) + 1);
            }
            reader.close();
            FileWriter writer = new FileWriter("records_" + filename);
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
