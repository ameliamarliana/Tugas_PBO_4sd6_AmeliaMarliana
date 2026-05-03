// Main class
public class MainKendaraan {
    public static void main(String[] args) {

        Kendaraan k1 = new Mobil("Porsche", 300, 2);
        Kendaraan k2 = new Motor("Scoopy", 104, "4-Tak");

        k1.infoKendaraan();
        k1.gerakkan();

        System.out.println();

        k2.infoKendaraan();
        k2.gerakkan();
    }
}
