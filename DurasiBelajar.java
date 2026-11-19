public class DurasiBelajar {
    public static void main(String[] args) {

        int[] durasi = {45, 60, 30, 90, 75};

        int total = 0;
        int palingLama = durasi[0];
        int palingSingkat = durasi[0];

        System.out.println("DAFTAR DURASI BELAJAR");

        for (int i = 0; i < durasi.length; i++) {

            System.out.println("Hari ke-" + (i + 1) + ": " + durasi[i] + " menit");

            total += durasi[i];

            if (durasi[i] > palingLama) {
                palingLama = durasi[i];
            }

            if (durasi[i] < palingSingkat) {
                palingSingkat = durasi[i];
            }
        }

        double rataRata = (double) total / durasi.length;

        System.out.println("----------------------");
        System.out.println("Total durasi: " + total + " menit");
        System.out.println("Rata-rata: " + rataRata + " menit");
        System.out.println("Paling lama: " + palingLama + " menit");
        System.out.println("Paling singkat: " + palingSingkat + " menit");
    }
}
