import java.util.ArrayList;

public class RentalManager {
    private ArrayList<Kendaraan> kendaraanList;
    private ArrayList<String> penyewaList;

    public RentalManager() {
        kendaraanList = new ArrayList<>();
        penyewaList = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }

    public void tambahPenyewa(String namaPenyewa, Kendaraan kendaraan) {
        penyewaList.add("Nama Penyewa: " + namaPenyewa + ", Kendaraan: " + kendaraan.merk + " " + kendaraan.model);
    }

    public void tampilkanKendaraan() {
        System.out.println("Daftar Kendaraan Tersedia:");
        for (Kendaraan kendaraan : kendaraanList) {
            kendaraan.displayInfo();
            System.out.println();
        }
    }

    public void tampilkanPenyewa() {
        System.out.println("Daftar Penyewa:");
        for (String penyewa : penyewaList) {
            System.out.println(penyewa);
        }
    }

    // Metode getter untuk kendaraanList
    public ArrayList<Kendaraan> getKendaraanList() {
        return kendaraanList;
    }
}

