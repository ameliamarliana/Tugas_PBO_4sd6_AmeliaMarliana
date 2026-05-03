import java.util.Scanner;

public class MainToko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TokoSerbaAda toko = new TokoSerbaAda();

        toko.tampilKatalog();

        System.out.print("Masukkan jumlah item : ");
        int jumlahItem = input.nextInt();

        Barang[] belanjaBarang = new Barang[jumlahItem];
        int[] belanjaJumlah = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("\nData ke " + (i + 1));

            System.out.print("Masukkan kode : ");
            String kode = input.next();

            Barang barang = toko.cariBarang(kode);

            if (barang == null) {
                System.out.println("Kode barang tidak ditemukan!");
                i--;
                continue;
            }

            System.out.print("Masukkan jumlah beli : ");
            int jumlah = input.nextInt();

            belanjaBarang[i] = barang;
            belanjaJumlah[i] = jumlah;
        }

        // STRUK RAPI
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("==================================================================");
        System.out.printf("%-3s %-6s %-15s %-8s %-10s %-10s\n",
                "No", "Kode", "Nama Barang", "Harga", "Jumlah", "Total");
        System.out.println("------------------------------------------------------------------");

        int totalBayar = 0;

        for (int i = 0; i < jumlahItem; i++) {
            Barang b = belanjaBarang[i];
            int jumlah = belanjaJumlah[i];
            int total = b.getHarga() * jumlah;

            totalBayar += total;

            System.out.printf("%-3d %-6s %-15s %-8d %-10d %-10d\n",
                    (i + 1),
                    b.getKode(),
                    b.getNama(),
                    b.getHarga(),
                    jumlah,
                    total);
        }

        System.out.println("------------------------------------------------------------------");
        System.out.printf("Total Bayar : Rp %d\n", totalBayar);
        System.out.println("==================================================================");
    }
}
