package TugasP5;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, angka = 1;

        System.out.print("Masukkan banyak baris: ");
        baris = input.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                angka++;
            }

            System.out.println();
        }
    }
}