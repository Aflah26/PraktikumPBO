package tugaspraktikump3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Tugas2 {
     
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Total Belanja: ");
        double belanja = input.nextDouble();

        System.out.print("Diskon (%): ");
        double diskonPersen = input.nextDouble();

        System.out.print("Bayar: ");
        double bayar = input.nextDouble();

        double potongan = belanja * diskonPersen / 100;
        double total = belanja - potongan;
        double kembalian = bayar - total;

        
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(buffer);

        dos.writeUTF(nama);
        dos.writeDouble(belanja);
        dos.writeDouble(diskonPersen);
        dos.writeDouble(total);
        dos.writeDouble(bayar);
        dos.writeDouble(kembalian);
        dos.flush();

        
        ByteArrayInputStream sumber =
            new ByteArrayInputStream(buffer.toByteArray());
        DataInputStream dis = new DataInputStream(sumber);

        System.out.println("\n=== STRUK BELANJA ===");
        System.out.println("Nama         : " + dis.readUTF());
        System.out.println("Total Belanja: Rp " + dis.readDouble());
        System.out.println("Diskon       : " + dis.readDouble() + "%");
        System.out.println("Total        : Rp " + dis.readDouble());
        System.out.println("Bayar        : Rp " + dis.readDouble());
        System.out.println("Kembalian    : Rp " + dis.readDouble());

        dis.close();
        dos.close();
        input.close();
    }
}
    

