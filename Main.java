import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalManager rentalManager = new RentalManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Sistem Manajemen Rental Kendaraan ---");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tambah Penyewa");
            System.out.println("3. Tampilkan Kendaraan");
            System.out.println("4. Tampilkan Penyewa");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline

            switch (choice) {
                case 1:
                    System.out.println("Pilih jenis kendaraan:");
                    System.out.println("1. Mobil");
                    System.out.println("2. Motor");
                    System.out.println("3. Sepeda");
                    System.out.print("Jenis: ");
                    int jenis = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Merk: ");
                    String merk = scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Tahun Produksi: ");
                    int tahunProduksi = scanner.nextInt();
                    scanner.nextLine();

                    if (jenis == 1) {  // Mobil
                        System.out.print("Jumlah Roda: ");
                        int jumlahRoda = scanner.nextInt();
                        scanner.nextLine();
                        rentalManager.tambahKendaraan(new Mobil(merk, model, tahunProduksi, jumlahRoda));

                    } else if (jenis == 2) {  // Motor
                        System.out.print("Jumlah Roda: ");
                        int jumlahRoda = scanner.nextInt();
                        scanner.nextLine();
                        rentalManager.tambahKendaraan(new Motor(merk, model, tahunProduksi, jumlahRoda));

                    } else if (jenis == 3) {  // Sepeda
                        System.out.print("Jenis Sepeda (misal: BMX, Balap): ");
                        String jenisSepeda = scanner.nextLine();
                        rentalManager.tambahKendaraan(new Sepeda(merk, model, tahunProduksi, jenisSepeda));

                    } else {
                        System.out.println("Jenis kendaraan tidak valid!");
                    }
                    break;

                case 2:
                    System.out.print("Nama Penyewa: ");
                    String namaPenyewa = scanner.nextLine();
                    System.out.print("Nomor indeks kendaraan yang ingin disewa (lihat daftar kendaraan): ");
                    int indeksKendaraan = scanner.nextInt();
                    scanner.nextLine();

                    // Menggunakan metode getKendaraanList() untuk mengakses kendaraanList
                    if (indeksKendaraan >= 0 && indeksKendaraan < rentalManager.getKendaraanList().size()) {
                        Kendaraan kendaraan = rentalManager.getKendaraanList().get(indeksKendaraan);
                        rentalManager.tambahPenyewa(namaPenyewa, kendaraan);
                    } else {
                        System.out.println("Indeks kendaraan tidak valid!");
                    }
                    break;

                case 3:
                    rentalManager.tampilkanKendaraan();
                    break;

                case 4:
                    rentalManager.tampilkanPenyewa();
                    break;

                case 5:
                    System.out.println("Keluar dari sistem...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

