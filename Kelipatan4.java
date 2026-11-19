public class Kelipatan4 {
    public static void main(String[] args) {

        int jumlah = 0;

        System.out.println("Angka kelipatan 4 dari 1 sampai 40:");

        for (int i = 1; i <= 40; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
                jumlah++;
            }
        }

        System.out.println("Jumlah angka kelipatan 4: " + jumlah);
    }
}