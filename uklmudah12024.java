import java.util.Scanner;
public class uklmudah12024 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan jarak pengiriman: ");
        int jarak = input.nextInt();
        
        System.out.println("Masukkan berat barang: ");
        int berat = input.nextInt();

        System.out.println("Masukkan panjang barang: ");
        int p = input.nextInt();

        System.out.println("Masukkan lebar barang: ");
        int l = input.nextInt();

        System.out.println("Masukkan tinggi barang: ");
        int t = input.nextInt();

        int volume = p*l*t;

        int hargaDekat = 4250;
        int hargaJauh = 6000;
        int hargaBesar = 50000;

        if (jarak <= 10){
            dekat(jarak, volume, berat, hargaDekat, hargaBesar);
        } else {
            jauh(jarak, volume, berat, hargaJauh, hargaBesar);
        }
    }


    public static void dekat (int jarak, int volume, int berat, int hargaDekat, int hargaBesar) {
        if (volume <= 100) {
            int harga = berat*hargaDekat;
            System.out.println("Total biaya pengiriman anda adalah: "+harga);
        } else {
            int harga = (berat*hargaDekat)+hargaBesar;
            System.out.println("Total biaya pengiriman anda adalah: "+harga);
        }
    }


    public static void jauh(int jarak, int volume, int berat, int hargaJauh, int hargaBesar) {
        if (volume <= 100) {
            int harga = berat*hargaJauh;
            System.out.println("Total biaya pengiriman anda adalah: "+harga);
        } else {
            int harga = (berat*hargaJauh)+hargaBesar;
            System.out.println("Total biaya pengiriman anda adalah: "+harga);
        }
    }

}
