package TugasP5;
import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, total = 0;

        System.out.print("Masukkan banyak angka: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int ganjil = (2 * i) - 1;

            System.out.print(ganjil + " ");
            total += ganjil;
        }

        System.out.println();
        System.out.println("Total penjumlahan: " + total);
    }
}
