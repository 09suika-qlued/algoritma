public class hitungFrekuensiAngka {
    public static void main(String[] args) {
        int[] angka = {2, 5, 2, 7, 5, 2, 8, 5};

        int hitung2 = 0;
        int hitung5 = 0;
        int hitung7 = 0;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == 2) {
                hitung2++;
            } else if (angka[i] == 5) {
                hitung5++;
            } else if (angka[i] == 7) {
                hitung7++;
            }
        }

        System.out.println("Angka 2 muncul " + hitung2 + " kali");
        System.out.println("Angka 5 muncul " + hitung5 + " kali");
        System.out.println("Angka 7 muncul " + hitung7 + " kali");
    }
}