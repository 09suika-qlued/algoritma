import java.util.Scanner;

public class syaratlomba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nilaiInformatika;
        String pernahMenang;

        System.out.println("=== SELEKSI PESERTA LOMBA ===");

        System.out.print("Masukkan nilai Informatika: ");
        nilaiInformatika = input.nextInt();

        input.nextLine();

        System.out.print("Pernah memenangkan lomba tingkat sekolah? (ya/tidak): ");
        pernahMenang = input.nextLine();

        if (nilaiInformatika >= 85 || pernahMenang.equalsIgnoreCase("ya")) {

            System.out.println("Selamat, kamu memenuhi syarat mengikuti lomba!");

        } else {

            System.out.println("Maaf, kamu belum memenuhi syarat mengikuti lomba.");

        }

        input.close();
    }
}

