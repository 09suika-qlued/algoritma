import java.util.Scanner;

public class MenghitungBiayaPerjalanan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int jarak;
        int biayaPerKm;
        int biayaParkir;
        int totalBiaya;

        System.out.println("=== MENGHITUNG BIAYA PERJALANAN ===");

        System.out.print("Masukkan jarak perjalanan (km): ");
        jarak = input.nextInt();

        System.out.print("Masukkan biaya per kilometer: Rp");
        biayaPerKm = input.nextInt();

        System.out.print("Masukkan biaya parkir: Rp");
        biayaParkir = input.nextInt();

        totalBiaya = (jarak * biayaPerKm) + biayaParkir;

        System.out.println("\n=== HASIL PERHITUNGAN ===");

        System.out.println("Jarak perjalanan : " + jarak + " km");
        System.out.println("Biaya per km     : Rp" + biayaPerKm);
        System.out.println("Biaya parkir     : Rp" + biayaParkir);
        System.out.println("--------------------------------");
        System.out.println("Total biaya      : Rp" + totalBiaya);

        input.close();
    }
}
