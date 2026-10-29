package tugaspraktikump3;

import java.util.Scanner;
public class Tugas4 {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan massa benda (kg): ");
        double massa = input.nextDouble();

        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = input.nextDouble();

        System.out.print("Masukkan jari-jari lintasan (m): ");
        double jariJari = input.nextDouble();

        if (massa < 0 || jariJari <= 0) {
            System.out.println("Massa tidak boleh negatif "
                    + "dan jari-jari harus lebih dari 0.");
        } else {
            double gaya = massa * kecepatan * kecepatan / jariJari;

            System.out.println("Gaya sentripetal = "
                    + gaya + " Newton");
        }

        input.close();
    }

}
