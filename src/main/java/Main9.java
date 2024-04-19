import java.io.*;
import java.util.*;

public class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        ArrayList<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        Collections.sort(lines);

        BufferedWriter writer = new BufferedWriter(new FileWriter("sorted_output.txt"));
        for (String sortedLine : lines) {
            writer.write(sortedLine + "\n");
        }
        writer.close();
    }
}
