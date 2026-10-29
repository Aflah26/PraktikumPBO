package tugaspraktikump3;

import java.util.Scanner;

public class Tugas1 {
   


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nomor Induk Karyawan: ");
        String nik = input.nextLine();

        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Jabatan: ");
        String jabatan = input.nextLine();

        System.out.print("Gaji Pokok: ");
        double gajiPokok = input.nextDouble();

        System.out.print("Tunjangan Jabatan: ");
        double tunjanganJabatan = input.nextDouble();

        System.out.print("Tunjangan Istri: ");
        double tunjanganIstri = input.nextDouble();

        System.out.print("Tunjangan Anak: ");
        double tunjanganAnak = input.nextDouble();

        double totalGaji = gajiPokok + tunjanganJabatan
                         + tunjanganIstri + tunjanganAnak;

        double pajak = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajak;

        System.out.println("\nSLIP GAJI PEGAWAI");
        System.out.println("NIK                 : " + nik);
        System.out.println("Nama                : " + nama);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Jabatan             : " + jabatan);
        System.out.println("Gaji Pokok          : Rp " + gajiPokok);
        System.out.println("Tunjangan Jabatan   : Rp " + tunjanganJabatan);
        System.out.println("Tunjangan Istri     : Rp " + tunjanganIstri);
        System.out.println("Tunjangan Anak      : Rp " + tunjanganAnak);
        System.out.println("Total Gaji          : Rp " + totalGaji);
        System.out.println("Pajak Penghasilan   : Rp " + pajak);
        System.out.println("Gaji Bersih         : Rp " + gajiBersih);

        input.close();
    }
}
    

