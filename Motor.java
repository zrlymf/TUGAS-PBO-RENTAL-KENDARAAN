public class Motor extends Kendaraan {
    private int jumlahRoda;

    public Motor(String merk, String model, int tahunProduksi, int jumlahRoda) {
        super(merk, model, tahunProduksi);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}
