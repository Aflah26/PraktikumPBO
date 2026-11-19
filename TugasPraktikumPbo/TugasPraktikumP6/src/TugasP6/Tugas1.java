package TugasP6;

public class Tugas1 {
    public static void main(String[] args) {

        
        int[] angka1 = new int[5];

        
        int[] angka2 = new int[]{10, 20, 30, 40, 50};

        
        int[] angka3 = {10, 20, 30, 40, 50};

        System.out.println("Array Cara 1:");
        for (int i = 0; i < angka1.length; i++) {
            System.out.print(angka1[i] + " ");
        }

        System.out.println("\nArray Cara 2:");
        for (int i = 0; i < angka2.length; i++) {
            System.out.print(angka2[i] + " ");
        }

        System.out.println("\nArray Cara 3:");
        for (int i = 0; i < angka3.length; i++) {
            System.out.print(angka3[i] + " ");
        }
    }
}