package TugasP5;
public class Tugas5 {
    public static void main(String[] args) {

        System.out.println("Half Triangle\t\tFull Triangle");

        
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.print("\t\t");

            
            int jumlahBintang = (i <= 3)
                    ? (2 * i - 1)
                    : (2 * (6 - i) - 1);

            for (int j = 1; j <= (5 - jumlahBintang) / 2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= jumlahBintang; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}