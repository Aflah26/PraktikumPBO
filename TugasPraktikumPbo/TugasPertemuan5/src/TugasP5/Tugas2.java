package TugasP5;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, angka, total = 0;
        double rataRata;

        System.out.print("Masukkan banyak bilangan: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            angka = input.nextInt();

            total += angka;
        }

        rataRata = (double) total / n;

        System.out.println("Total jumlah: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}