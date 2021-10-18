package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static int SumaCifara (int n) {
        int suma = 0;
        while (n != 0) {
            suma = suma + n % 10;
            n = n / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Unesite broj: ");
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int sumaCif = SumaCifara(i);
            if (i % sumaCif == 0) {
                System.out.println(i);
            }
        }
    }
}
