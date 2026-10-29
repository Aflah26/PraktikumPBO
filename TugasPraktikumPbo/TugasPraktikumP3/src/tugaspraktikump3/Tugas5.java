package tugaspraktikump3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas5 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Jumlah jambu yang dibeli: ");
        int jambu = Integer.parseInt(input.readLine());

        System.out.print("Jumlah mangga yang dibeli: ");
        int mangga = Integer.parseInt(input.readLine());

        System.out.print("Jumlah tetangga: ");
        int tetangga = Integer.parseInt(input.readLine());

        System.out.print("Jambu untuk setiap tetangga: ");
        int jambuDibagikan = Integer.parseInt(input.readLine());

        System.out.print("Mangga busuk yang dikembalikan: ");
        int manggaBusuk = Integer.parseInt(input.readLine());

        if (jambu < 0 || mangga < 0 || tetangga < 0
                || jambuDibagikan < 0 || manggaBusuk < 0
                || tetangga * jambuDibagikan > jambu
                || manggaBusuk > mangga) {
            System.out.println("Data jumlah buah tidak valid.");
            return;
        }

        int totalJambuDibagikan = tetangga * jambuDibagikan;
        int sisaJambu = jambu - totalJambuDibagikan;
        int manggaBaik = mangga - manggaBusuk;
        int totalBuahBaik = sisaJambu + manggaBaik;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Jambu dibagikan: "
                + totalJambuDibagikan + " buah");
        System.out.println("Sisa jambu: " + sisaJambu + " buah");
        System.out.println("Mangga busuk: "
                + manggaBusuk + " buah");
        System.out.println("Mangga baik: "
                + manggaBaik + " buah");
        System.out.println("Total buah baik tersisa: "
                + totalBuahBaik + " buah");
    }
}
