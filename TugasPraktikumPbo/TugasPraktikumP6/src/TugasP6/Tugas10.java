package TugasP6;

public class Tugas10 {
    public static void main(String[] args) {

        Object[] data = {
            19,
            0.2,
            'C',
            "Java",
            true
        };

        System.out.println("Data Array:");

        for (int i = 0; i < data.length; i++) {

            System.out.println("Data ke-" + (i + 1) + ": " + data[i]);

        }
    }
}