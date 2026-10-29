package tugaspraktikump3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.time.LocalTime;



public class Tugas6 {
     public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Masukkan waktu pertama (HH:mm): ");
        LocalTime waktu1 = LocalTime.parse(input.readLine());

        System.out.print("Masukkan waktu kedua (HH:mm): ");
        LocalTime waktu2 = LocalTime.parse(input.readLine());

        long menit1 = waktu1.toSecondOfDay() / 60;
        long menit2 = waktu2.toSecondOfDay() / 60;

        long selisih = Math.abs(menit2 - menit1);

        
        if (selisih > 720) {
            selisih = 1440 - selisih;
        }

        long jam = selisih / 60;
        long menit = selisih % 60;

        System.out.println("\n=== HASIL SELISIH WAKTU ===");
        System.out.println("Waktu pertama: " + waktu1);
        System.out.println("Waktu kedua  : " + waktu2);
        System.out.println("Selisih waktu: " + jam
                + " jam " + menit + " menit");
    }

    
}
