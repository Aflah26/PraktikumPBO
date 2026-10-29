package tugaspraktikump3;

import java.util.Scanner;
/*
Scanner: Merupakan kelas yang dirancang khusus untuk mem-parsing (mengurai) teks
primitif dan regular expression (regex).
Scanner dapat membaca berbagai tipe data secara langsung (seperti nextInt(),
nextDouble(), nextBoolean())
karena secara otomatis mengubah teks mentah menjadi tipe data yang diinginkan. 
*/
public class Tugas3Scan {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");

        input.close();
    }
}
 