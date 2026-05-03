// Class turunan Mobil
class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, int kecepatanMaksimal, int jumlahPintu) {
        super(merk, kecepatanMaksimal);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    void gerakkan() {
        System.out.println("Mobil " + merk + " melaju di jalan raya!");
    }

    @Override
    void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
