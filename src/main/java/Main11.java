import java.io.*;
import java.util.*;

public class Main11 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la palabra a buscar: ");
        String searchWord = scanner.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader("sorted_input.txt"));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        int index = Collections.binarySearch(lines, searchWord);
        System.out.println(index >= 0 ? "Palabra encontrada." : "Palabra no encontrada.");
    }
}
