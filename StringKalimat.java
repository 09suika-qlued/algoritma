
import java.util.Scanner;

public class StringKalimat {

    static void olahKalimat() {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        
        int jumlahKarakter = kalimat.length();

        
        int jumlahA = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.toLowerCase().charAt(i) == 'a') {
                jumlahA++;
            }
        }

        
        String kapital = kalimat.toUpperCase();

        
        char pertama = kalimat.charAt(0);
        char terakhir = kalimat.charAt(kalimat.length() - 1);

        
        System.out.println("\nJumlah karakter: " + jumlahKarakter);
        System.out.println("Jumlah huruf a: " + jumlahA);
        System.out.println("Huruf kapital: " + kapital);
        System.out.println("Karakter pertama: " + pertama);
        System.out.println("Karakter terakhir: " + terakhir);
    }

    public static void main(String[] args) {
        olahKalimat();
    }
}
