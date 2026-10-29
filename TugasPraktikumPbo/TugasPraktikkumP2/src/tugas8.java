public class tugas8 {
 public static void main(String[] args) {
        double jarakBulan = 384400.0;
        double jarakMatahari = 152100000.0; 
        double kecepatanCahaya = 300000.0; 

        double waktuKeBulan = jarakBulan / kecepatanCahaya; 
        double waktuKeMatahari = jarakMatahari / kecepatanCahaya; 

        System.out.println("Waktu tempuh ke Bulan: " + waktuKeBulan + " detik (" + (waktuKeBulan / 60) + " menit)");
        System.out.println("Waktu tempuh ke Matahari: " + waktuKeMatahari + " detik (" + (waktuKeMatahari / 60) + " menit / " + (waktuKeMatahari / 3600) + " jam)");
    }
}
