import java.util.ArrayList;

public class SoalNo3 {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan kecepatan kendaraan
        ArrayList<Integer> kecepatanKendaraan = new ArrayList<>();
        // Membuat ArrayList untuk menyimpan kecepatan antara 80-100 km/jam
        ArrayList<Integer> kecepatan80Ke100 = new ArrayList<>();
        // Membuat ArrayList untuk menyimpan kecepatan di bawah 80 km/jam
        ArrayList<Integer> kecepatanDibawah80 = new ArrayList<>();

        // Menangkap 200 kecepatan kendaraan
        for (int i = 0; i < 200; i++) {
            int kecepatan = metodeTipe4();
            kecepatanKendaraan.add(kecepatan);

            // Memisahkan kecepatan sesuai kriteria
            if (kecepatan >= 80 && kecepatan <= 100) {
                kecepatan80Ke100.add(kecepatan);
            } else if (kecepatan < 80) {
                kecepatanDibawah80.add(kecepatan);
            }
        }

        // Menampilkan kecepatan kendaraan antara 80-100 km/jam
        System.out.println("Kecepatan antara 80-100 km/jam:");
        for (int kecepatan : kecepatan80Ke100) {
            System.out.println("Kecepatan: " + kecepatan + " km/jam");
        }

        // Menampilkan kecepatan kendaraan di bawah 80 km/jam
        System.out.println("\nKecepatan di bawah 80 km/jam:");
        for (int kecepatan : kecepatanDibawah80) {
            System.out.println("Kecepatan: " + kecepatan + " km/jam");
        }
    }

    private static int metodeTipe4() {
        return (int) (Math.random() * 120); // Menghasilkan kecepatan acak antara 0-119 km/jam
    }
}