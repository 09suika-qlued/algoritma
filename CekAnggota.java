import java.util.Scanner;

public class CekAnggota {

    static void cariAnggota() {

        Scanner input = new Scanner(System.in);

        String[] anggota = {"Andi", "Budi", "Citra", "Dina", "Eko"};

        System.out.print("Masukkan nama anggota: ");
        String cari = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < anggota.length; i++) {
            if (anggota[i].equals(cari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println(cari + " terdaftar.");
        } else {
            System.out.println(cari + " tidak terdaftar.");
        }
    }

    public static void main(String[] args) {
        cariAnggota();
    }
}