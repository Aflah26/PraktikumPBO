package TugasP6;

import java.util.Scanner;
import java.util.Arrays;

public class Tugas3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah elemen harus lebih dari 0!");
            return;
        }

        int[] angka = new int[n];

        // a dan b. Input data array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka indeks " + i + ": ");
            angka[i] = input.nextInt();
        }

        int terbesar = angka[0];
        int terkecil = angka[0];

        int indeksTerbesar = 0;
        int indeksTerkecil = 0;

        int total = 0;
        int jumlahIndeksGanjil = 0;
        int jumlahIndeksGenap = 0;

        // c dan d. Mencari nilai terbesar, terkecil, dan rata-rata
        for (int i = 0; i < n; i++) {

            if (angka[i] > terbesar) {
                terbesar = angka[i];
                indeksTerbesar = i;
            }

            if (angka[i] < terkecil) {
                terkecil = angka[i];
                indeksTerkecil = i;
            }

            total += angka[i];

            // e. Indeks ganjil
            if (i % 2 != 0) {
                jumlahIndeksGanjil += angka[i];
            }

            // f. Indeks genap
            if (i % 2 == 0) {
                jumlahIndeksGenap += angka[i];
            }
        }

        double rataRata = (double) total / n;

        System.out.println("\n=== HASIL ARRAY ===");

        System.out.println("Nilai terbesar: " + terbesar);
        System.out.println("Posisi indeks: " + indeksTerbesar);

        System.out.println("Nilai terkecil: " + terkecil);
        System.out.println("Posisi indeks: " + indeksTerkecil);

        System.out.println("Jumlah seluruh data: " + total);
        System.out.println("Nilai rata-rata: " + rataRata);

        // e dan f. Hasil penjumlahan indeks
        System.out.println("Jumlah indeks ganjil: " + jumlahIndeksGanjil);
        System.out.println("Jumlah indeks genap: " + jumlahIndeksGenap);

        // g. Mengecek ganjil atau genap
        System.out.println("\n=== CEK HASIL PENJUMLAHAN ===");

        if (jumlahIndeksGanjil % 2 == 0) {
            System.out.println("Jumlah indeks ganjil bernilai GENAP");
        } else {
            System.out.println("Jumlah indeks ganjil bernilai GANJIL");
        }

        if (jumlahIndeksGenap % 2 == 0) {
            System.out.println("Jumlah indeks genap bernilai GENAP");
        } else {
            System.out.println("Jumlah indeks genap bernilai GANJIL");
        }

        // h. Mengurutkan array
        Arrays.sort(angka);

        System.out.println("\nArray setelah diurutkan:");

        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }

        input.close();
    }
}