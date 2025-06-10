public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new MobilPribadi("B1234ABC", "Toyota", 2021);
        Kendaraan bus = new Bus("D5868XYZ", "Mercedes", 2019);
        Truk truk = new Truk("B9212TUK", "Hino", 2020, 5000);

        Kendaraan[] kendaraanArray = {mobil, bus, truk};

        for (Kendaraan k : kendaraanArray) {
            System.out.println("=== Info Kendaraan ===");
            k.tampilkanInfo();
            System.out.println("Biaya Sewa 3 hari: Rp" + k.hitungBiayaSewa(3));
            System.out.println("Perlu Supir: " + (k.perluSupir() ? "Ya" : "Tidak"));
            if (k instanceof Muatan) {
                System.out.println("Kapasitas Muatan: " + ((Muatan) k).kapasitasMuatan() + " kg");
            }
            System.out.println();
        }
    }
}
