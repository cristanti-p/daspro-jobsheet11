import java.util.Scanner;

public class modifikasiCafe15 {
    static int[][] salesData; // Array penjualan yang akan disesuaikan dengan input jumlah menu dan hari
    static String[] menu; // Array menu yang akan diisi berdasarkan input
    static int jumlahHari; // Menyimpan jumlah hari
    static int jumlahMenu; // Menyimpan jumlah menu

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah menu dan jumlah hari
        System.out.print("Masukkan jumlah menu: ");
        jumlahMenu = scanner.nextInt();
        
        System.out.print("Masukkan jumlah hari: ");
        jumlahHari = scanner.nextInt();
        
        // Inisialisasi array salesData sesuai dengan jumlah menu dan hari
        salesData = new int[jumlahMenu][jumlahHari];
        menu = new String[jumlahMenu];

        // Input nama menu
        scanner.nextLine(); // Untuk membersihkan newline setelah nextInt()
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = scanner.nextLine();
        }
        int choice;
        do {
            System.out.println("\nPilih menu:");
            System.out.println("1. Input data penjualan");
            System.out.println("2. Tampilkan seluruh data penjualan");
            System.out.println("3. Tampilkan menu dengan penjualan tertinggi");
            System.out.println("4. Tampilkan rata-rata penjualan untuk setiap menu");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputPenjualan(scanner);
                    break;
                case 2:
                    tampilkanDataPenjualan();
                    break;
                case 3:
                    tampilkanMenuTertinggi();
                    break;
                case 4:
                    tampilkanRataRataPenjualan(); 
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 5); 
        scanner.close();
    }
     // Fungsi untuk input data penjualan
     public static void inputPenjualan(Scanner scanner) {
        System.out.println("\nMasukkan data penjualan untuk setiap menu (selama " + jumlahHari + " hari):");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Masukkan penjualan untuk menu " + menu[i] + ":");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                salesData[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh data penjualan
    public static void tampilkanDataPenjualan() {
        System.out.println("\nData Penjualan per Menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(salesData[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public static void tampilkanMenuTertinggi() {
        int maxSales = 0;
        String bestMenu = "";
        for (int i = 0; i < jumlahMenu; i++) {
            int totalSales = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalSales += salesData[i][j];  // Menjumlahkan penjualan setiap menu
            }
            if (totalSales > maxSales) {
                maxSales = totalSales;
                bestMenu = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah " + bestMenu + " dengan total penjualan " + maxSales);
    }

    // Fungsi untuk menampilkan rata-rata penjualan per menu
    public static void tampilkanRataRataPenjualan() {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            int totalSales = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalSales += salesData[i][j];  // Menjumlahkan penjualan setiap menu
            }
            double avgSales = totalSales / (double) jumlahHari;
            System.out.println(menu[i] + ": " + avgSales);
        }
    }
}