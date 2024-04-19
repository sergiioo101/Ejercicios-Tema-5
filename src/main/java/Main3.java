import java.util.Scanner;

public class Main3 {
    public static int cuentaDigitos (int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + cuentaDigitos(n / 10);
        }
    }
}
