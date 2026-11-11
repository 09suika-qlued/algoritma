import java.util.Scanner;

public class antreankantin {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        String namaPembeli;
        int jumlahMakanan;
        int hargaMakanan;
        int totalPembayaran;

        
        System.out.print("Masukkan nama pembeli: ");
        namaPembeli = input.nextLine();

        System.out.print("Masukkan jumlah makanan yang dibeli: ");
        jumlahMakanan = input.nextInt();

        System.out.print("Masukkan harga satu makanan: Rp");
        hargaMakanan = input.nextInt();


        totalPembayaran = jumlahMakanan * hargaMakanan;

    
        System.out.println("\n=== DETAIL PEMBAYARAN ===");
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Total yang harus dibayar: Rp" + totalPembayaran);
        System.out.println("=========================");

        
        input.close();
    }
}
    

