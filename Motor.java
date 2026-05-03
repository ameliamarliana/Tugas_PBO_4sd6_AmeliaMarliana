// Class turunan Motor
class Motor extends Kendaraan {
    private String jenisMesin;

    public Motor(String merk, int kecepatanMaksimal, String jenisMesin) {
        super(merk, kecepatanMaksimal);
        this.jenisMesin = jenisMesin;
    }

    @Override
    void gerakkan() {
        System.out.println("Motor " + merk + " melaju di jalan!");
    }

    @Override
    void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
