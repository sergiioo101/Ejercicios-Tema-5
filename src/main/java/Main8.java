import java.util.Random;
import java.util.Scanner;

public class Main8 {
    private static String generarRandomADN(int length) {
        String bases = "ACGT";
        Random random = new Random();
        StringBuilder dna = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(bases.length());
            dna.append(bases.charAt(index));
        }
        return dna.toString();
    }

    private static int contarGenes(String dna) {
        int count = 0;
        for (int i = 0; i <= dna.length() - 3; i += 3) {
            if (dna.substring(i, i + 3).equals("ATG")) {
                count++;
            }
        }
        return count;
    }
}
