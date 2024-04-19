import java.util.Scanner;

public class Main7 {
    public static int coeficienteBinomial(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        return coeficienteBinomial(n - 1, k) + coeficienteBinomial(n - 1, k - 1);
    }
}
