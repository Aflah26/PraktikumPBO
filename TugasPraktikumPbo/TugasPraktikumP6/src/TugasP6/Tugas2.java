package TugasP6;

public class Tugas2 {
    public static void main(String[] args) {

        String[] mobil = {
            "Tesla", "Suzuki", "Civic", "Mazda", "BMW"
        };

       
        mobil[1] = "Toyota";

        System.out.println("Data mobil setelah diubah:");

        for (int i = 0; i < mobil.length; i++) {
            System.out.println("Indeks " + i + ": " + mobil[i]);
        }
    }
}