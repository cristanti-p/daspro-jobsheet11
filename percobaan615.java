import java.util.Scanner;

public class percobaan615 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan panjang : ");
        p=input.nextInt();
        System.out.print("Masukkan lebar : ");
        l=input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t=input.nextInt();

        L=p*l;
        System.out.println("Luas Persegi Panjang adalah "+L);

        vol=p*l*t;
        System.out.println("VOlume balok adalah "+ vol);
    }
    static int hitungLuas (int pjg, int lb){
        int luas=pjg*lb;
        return luas;
    }

    static int hitungVolume (int tinggi, int a, int b){
        int volume= hitungLuas(a, b)*tinggi;
        return volume;
    }
    
}
