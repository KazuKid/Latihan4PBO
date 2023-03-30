import java.util.Scanner;

public class DetikKeWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;

        do {
            System.out.print("Masukkan jumlah detik: ");
            long detik = input.nextLong();

            long hari = detik / 86400;
            detik %= 86400;
            long jam = detik / 3600;
            detik %= 3600;
            long menit = detik / 60;
            detik %= 60;

            System.out.println("Hari  :" + hari);
            System.out.println("Jam   :" + jam);
            System.out.println("Detik :" + detik);
            System.out.print("Input data lagi [Y/T]? ");
            pilihan = input.next();
        } while (pilihan.equalsIgnoreCase("Y"));

        input.close();
    }
}
