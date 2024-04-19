import java.util.Scanner;

public class Main2 {
    public static void sumaRango (int a, int b) {
        if (a > b) {
            return;
        }
        System.out.println(a + " ");
        sumaRango(a + 1, b);
    }
}
