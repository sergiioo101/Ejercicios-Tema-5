import java.util.Scanner;

public class Main5 {
    public static int maximoVector(int[] vector, int index) {
        if (index == vector.length - 1) {
            return vector[index];
        }
        return Math.max(vector[index], maximoVector(vector, index + 1));
    }
}
