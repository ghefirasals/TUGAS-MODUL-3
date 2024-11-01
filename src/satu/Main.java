package satu;

class MenuKue {
    private String namaKue;
    private int hargaKue;
    private String deskripsiKue;
    private boolean isAvailable;
    private int stokKue;

    public MenuKue(String namaKue, int hargaKue, String deskripsiKue, boolean isAvailable, int stokKue) {
        if (hargaKue < 0 || stokKue < 0) {
            throw new IllegalArgumentException("Harga dan stok kue tidak bisa negatif.");
        }
        this.namaKue = namaKue;
        this.hargaKue = hargaKue;
        this.deskripsiKue = deskripsiKue;
        this.isAvailable = isAvailable;
        this.stokKue = stokKue;
    }

    public void tampilkanMenu() {
        System.out.printf("Nama Kue: %s\nHarga Kue: %d\nDeskripsi Kue: %s\nAvailability: %s\nStok Kue: %d\n",
                namaKue, hargaKue, deskripsiKue, (isAvailable ? "Tersedia" : "Tidak Tersedia"), stokKue);
    }

    public void updateStok(int jumlahStok) {
        if (stokKue + jumlahStok < 0) {
            throw new IllegalArgumentException("Stok tidak bisa negatif.");
        }
        stokKue += jumlahStok;
    }

    public void setKetersediaan(boolean ketersediaan) {
        this.isAvailable = ketersediaan;
    }

    public static void main(String[] args) {
        MenuKue Kue1 = new MenuKue("Roti", 5000, "Roti yang Lembut", true, 10);
        MenuKue Kue2 = new MenuKue("Wafer", 3000, "Wafer yang Renyah", false, 5);

        Kue1.tampilkanMenu();
        Kue2.tampilkanMenu();

        Kue1.updateStok(5);
        Kue2.setKetersediaan(true);

        Kue1.tampilkanMenu();
        Kue2.tampilkanMenu();
    }
}
