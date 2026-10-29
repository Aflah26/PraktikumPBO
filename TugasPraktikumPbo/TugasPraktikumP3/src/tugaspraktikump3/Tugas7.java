package tugaspraktikump3;

import java.util.Scanner;

public class Tugas7 {
           
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM MENGHITUNG WAKTU PERCETAKAN NOVEL");
        System.out.print("Masukkan jumlah novel yang akan dicetak : ");
        float jumlahNovel = input.nextFloat();

        System.out.print("Masukkan tebal lembar per novel         : ");
        float tebalLembar = input.nextFloat();

        float totalDetik = jumlahNovel * tebalLembar;

        float hari = totalDetik / 86400.0f;
        float sisaHari = totalDetik % 86400.0f;

        float jam = sisaHari / 3600.0f;
        float sisaJam = sisaHari % 3600.0f;

        float menit = sisaJam / 60.0f;
        float detik = sisaJam % 60.0f;

        System.out.println("\nHASIL PERHITUNGAN");
        System.out.println("Total Lembar Cetak : " + (int) totalDetik + " lembar");
        System.out.println("Waktu yang diperlukan:");
        System.out.println("- Hari  : " + (int) hari);
        System.out.println("- Jam   : " + (int) jam);
        System.out.println("- Menit : " + (int) menit);
        System.out.println("- Detik : " + detik);
    }
}
    
