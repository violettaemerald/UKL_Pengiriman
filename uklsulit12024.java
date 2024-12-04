import java.util.Scanner;

public class uklsulit12024 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Berapa murid yang akan diinputkan nilainya?");
        int siswa = input.nextInt();

        double nilai [] = new double [siswa];
        double sum = 0;
        for (int i = 0; i < siswa; i++) {
            System.out.println("Masukkan nilai murid ke-"+i);
            nilai [i] = input.nextDouble();
            sum += nilai[i];
        }

        for (int i = 0; i < siswa; i++) {
            System.out.print(nilai[i]+"+");
        }
        System.out.println(sum);

        double rataRata = (sum / siswa);
        
        System.out.println("Rata rata nilai "+siswa+" anak adalah "+rataRata);

    }
}
