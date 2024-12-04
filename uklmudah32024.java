import java.util.Scanner;
public class uklmudah32024 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan berapa data yang ingin dimunculkan:");
        int banyaknama = input.nextInt();

        for (int i = banyaknama; i >= 2; i--){
            String [] pernyataan = {"", "Saya anak Moklet", "Saya anak Wikusama", "Saya angkatan 33"};
            
            if (i % 3 == 0) {
                System.out.println(i+". " + pernyataan[1]);       
            } else if (i % 2 == 0) {
                System.out.println(i+". " + pernyataan[2]);            
            } else {
                System.out.println(i+". " + pernyataan[3]);
            }
        }

        System.out.println("1. Saya senang");
        
    }
}
