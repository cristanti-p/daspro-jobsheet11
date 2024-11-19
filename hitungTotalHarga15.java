import java.util.Scanner;

public class hitungTotalHarga15 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        switch (kodePromo) {
            case "DISKON50":
                System.out.println("Anda mendapatkan diskon 50%");
                break;
            case "DISKON30":
                System.out.println("Anda mendapatkan diskon 30%");
                break;
            default:
                System.out.println("Kode promo tidak valid");
        }
        return hargaTotal;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.next();

        int hitungTotalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp" + hitungTotalHarga);
        
    }
}
