import java.util.Scanner;

public class modifikasiHitungTotalHarga15 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        String[] namaItems = {"Kopi Hitam", "Latte", "Cappuccino", "Teh Tarik", "Mie Goreng", "Roti Bakar"};
        String kodePromo;
        int pilihanMenu, banyakItem, totalHarga = 0;
        boolean lanjutPesan = true;

        while (lanjutPesan) {
            System.out.println("Daftar Menu:");
            for (int i = 0; i < namaItems.length; i++) {
                System.out.println((i+1) + ". " + namaItems[i] + " - Rp " + hargaItems[i]);
            }

            System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
            pilihanMenu = scanner.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            banyakItem = scanner.nextInt();

            totalHarga += hargaItems[pilihanMenu - 1] * banyakItem;

            System.out.print("Apakah Anda ingin memesan menu lain? (y/n): ");
            String lanjut = scanner.next();
            lanjutPesan = lanjut.equalsIgnoreCase("y");
        }

        System.out.print("Masukkan kode promo (jika ada): ");
        kodePromo = scanner.next();

        switch (kodePromo) {
            case "DISKON50":
                totalHarga *= 0.5;
                break;
            case "DISKON30":
                totalHarga *= 0.7;
                break;
            default:
                System.out.println("Kode promo tidak valid");
        }

        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);
    }
}
