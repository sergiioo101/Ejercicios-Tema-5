import java.util.Random;
import java.util.Scanner;

public class Main8 {
    private static String generateRandomDNA(int length) {
        String bases = "ACGT";
        Random random = new Random();
        StringBuilder dna = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(bases.length());
            dna.append(bases.charAt(index));
        }
        return dna.toString();
    }
}
