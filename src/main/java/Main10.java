import java.io.*;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la palabra a buscar: ");
        String searchWord = scanner.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (line.contains(searchWord)) {
                found = true;
                break;
            }
        }
        reader.close();

        System.out.println(found ? "Palabra encontrada." : "Palabra no encontrada.");
    }
}
