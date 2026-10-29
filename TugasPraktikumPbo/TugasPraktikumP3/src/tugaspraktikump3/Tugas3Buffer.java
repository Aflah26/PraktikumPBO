package tugaspraktikump3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
BufferedReader: Membaca teks dari input stream (aliran masukan) dalam bentuk
urutan karakter (karakter demi karakter atau baris per baris). BufferedReader
selalu mengembalikan data dalam bentuk String, sehingga jika kamu ingin memasukkannya
ke tipe data lain (seperti int atau double), kamu harus mengonversinya secara
manual (misalnya menggunakan Integer.parseInt()).
*/
public class Tugas3Buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Masukkan nama: ");
        String nama = input.readLine();

        System.out.print("Masukkan umur: ");
        int umur = Integer.parseInt(input.readLine());

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }    
}
