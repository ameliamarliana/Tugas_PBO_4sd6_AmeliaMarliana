// Class abstract Kendaraan
abstract class Kendaraan {
    protected String merk;
    protected int kecepatanMaksimal;

    // Constructor
    public Kendaraan(String merk, int kecepatanMaksimal) {
        this.merk = merk;
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    // Abstract method
    abstract void gerakkan();

    // Method info
    void infoKendaraan() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Maksimal: " + kecepatanMaksimal + " km/jam");
    }
}
