import java.util.Scanner;

public class Penjualan {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;

    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public float getTotalPembelian() {
        return harga * jumlah;
    }

    public String getBonus() {
        if (getTotalPembelian() >= 500000 && jumlah > 5) {
            return "Setrika";
        } else if (getTotalPembelian() >= 100000 && jumlah > 3) {
            return "Payung";
        } else if (getTotalPembelian() >= 50000 || jumlah > 2) {
            return "Ballpoint";
        } else {
            return "Tidak Ada Bonus";
        }
    }

    public void cetakNota() {
        System.out.println("========== Nota Pembelian ==========");
        System.out.println("Kode Barang\t: " + kode);
        System.out.println("Nama Barang\t: " + nama);
        System.out.println("Harga Barang\t: " + harga);
        System.out.println("Jumlah Barang\t: " + jumlah);
        System.out.println("Total Pembelian\t: " + getTotalPembelian());
        System.out.println("Bonus\t\t: " + getBonus());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan kode barang: ");
            String kode = input.nextLine();

            System.out.print("Masukkan nama barang: ");
            String nama = input.nextLine();

            System.out.print("Masukkan harga barang: ");
            float harga = input.nextFloat();

            System.out.print("Masukkan jumlah barang: ");
            int jumlah = input.nextInt();

            // Buang karakter newline yang tersisa setelah input jumlah barang
            input.nextLine();

            Penjualan penjualan = new Penjualan();
            penjualan.setData(kode, nama, harga, jumlah);
            penjualan.cetakNota();

            System.out.print("Input data lagi [Y/T]? ");
            String pilihan = input.nextLine();
            if (pilihan.equalsIgnoreCase("T")) {
                break;
            }
        }
    }
}
