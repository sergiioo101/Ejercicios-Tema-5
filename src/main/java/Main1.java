public class Main1 {
    public static int sumaNaturales(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumaNaturales(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Suma de los primeros 5 numeros naturales: " + sumaNaturales(5));
    }
}


