public class tugas9 {
 public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;

        System.out.println("--- A. Celcius ke Fahrenheit & Sebaliknya ---");
        double cToF = (C * 9/5) + 32;
        double fToC = (F - 32) * 5/9;
        System.out.println(C + " C ke Fahrenheit = " + cToF + " F");
        System.out.println(F + " F ke Celcius = " + fToC + " C");

        System.out.println("\n--- B. Celcius ke Reamur & Sebaliknya ---");
        double cToR = C * 4/5;
        double rToC = R * 5/4;
        System.out.println(C + " C ke Reamur = " + cToR + " R");
        System.out.println(R + " R ke Celcius = " + rToC + " C");

        System.out.println("\n--- C. Fahrenheit ke Reamur & Sebaliknya ---");
        double fToR = (F - 32) * 4/9;
        double rToF = (R * 9/4) + 32;
        System.out.println(F + " F ke Reamur = " + fToR + " R");
        System.out.println(R + " R ke Fahrenheit = " + rToF + " F");
    }
}
