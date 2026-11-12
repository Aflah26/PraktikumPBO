package TugasP5;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka, terbesar, terkecil;

        System.out.println("Masukkan 10 bilangan:");

        angka = input.nextInt();
        terbesar = angka;
        terkecil = angka;

        for (int i = 2; i <= 10; i++) {
            angka = input.nextInt();

            if (angka > terbesar) {
                terbesar = angka;
            }

            if (angka < terkecil) {
                terkecil = angka;
            }
        }

        System.out.println("Bilangan terbesar: " + terbesar);
        System.out.println("Bilangan terkecil: " + terkecil);
    }
}
