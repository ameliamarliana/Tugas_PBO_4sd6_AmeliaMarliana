import java.util.Scanner;

public class KasirToko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        double totalBelanja, diskon = 0, potongan, totalBayar;
        int pilihan;
        String kategori = "";
        String metodePembayaran;

        // Input
        System.out.print("Masukkan nama pelanggan : ");
        nama = input.nextLine();

        System.out.print("Total harga belanja : ");
        totalBelanja = input.nextDouble();

        // Menu kategori
        System.out.println("Pilih kategori member : ");
        System.out.println("1. Regular");
        System.out.println("2. Silver");
        System.out.println("3. Gold");
        System.out.println("4. Platinum");
        System.out.print("Pilihan : ");
        pilihan = input.nextInt();

        // Switch-case diskon
        switch (pilihan) {
            case 1:
                kategori = "Regular";
                diskon = 0;
                break;
            case 2:
                kategori = "Silver";
                diskon = 0.10;
                break;
            case 3:
                kategori = "Gold";
                diskon = 0.20;
                break;
            case 4:
                kategori = "Platinum";
                diskon = 0.30;
                break;
            default:
                System.out.println("Kategori tidak dikenal, diskon tidak diterapkan");
                kategori = "Tidak diketahui";
                diskon = 0;
        }

        // Hitung
        potongan = totalBelanja * diskon;
        totalBayar = totalBelanja - potongan;

        // If-else metode pembayaran
        if (totalBayar < 50000) {
            metodePembayaran = "Tunai";
        } else if (totalBayar >= 50000 && totalBayar < 200000) {
            metodePembayaran = "Tunai / Transfer";
        } else {
            metodePembayaran = "Tunai / Transfer / Kartu Kredit";
        }

        // Output struk
        System.out.println("\n========== STRUK PEMBAYARAN ==========");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Kategori Member : " + kategori);
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Diskon (" + (int)(diskon * 100) + "%) : Rp " + potongan);
        System.out.println("Total Bayar : Rp " + totalBayar);
        System.out.println("--------------------------------------");
        System.out.println("Metode Pembayaran : " + metodePembayaran);
        System.out.println("======================================");
    }
}
