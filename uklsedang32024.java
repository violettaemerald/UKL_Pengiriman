import java.util.Random;
import java.util.Scanner;

public class uklsedang32024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean terusMain = true;

        System.out.println("Selamat datang di kuis matemarika!");
        System.out.println("Anda dapat mengetik 'exit' untuk menyelesaikan permainan");

        while (terusMain) {
            int bilangan1 = random.nextInt(100);
            int bilangan2 = random.nextInt(10);
            String[] paraOperator = {"*", "/", "%", "+", "-"};
            String operator = paraOperator[random.nextInt(paraOperator.length)];

            System.out.println("Berapa hasil dari: "+ bilangan1 + " " + operator + " " + bilangan2  + " "+"=");

            double jawabanBenar = 0;
            switch (operator) {
                case "*":
                    jawabanBenar = bilangan1 * bilangan2;
                    break;
                
                case "/":
                    jawabanBenar = (double) bilangan1 / bilangan2;
                    break;
                
                case "%":
                    jawabanBenar = bilangan1 % bilangan2;
                    break;
                
                case "+":
                    jawabanBenar = bilangan1 + bilangan2;
                    break;
                
                case "-":
                    jawabanBenar = bilangan1 - bilangan2;
                    break;
                
            }

            String jawaban = input.nextLine();

            if (jawaban.equalsIgnoreCase("exit")) {
                terusMain = false;
                System.out.println("Terimakasih telah bermain!");
                break;
            }

            try {
                double jawabanuser = Double.parseDouble(jawaban);
                if (Math.abs(jawabanuser - jawabanBenar) < 0.0001){
                    System.out.println("Jawaban anda benar!\n");
                } else {
                    System.out.println("Jawaban anda salah. Jawaban yang benar adalah: "+jawabanBenar+"\n");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Input anda tidak valid. Harap masukkan angka atau 'exit' untuk keluar dari permainan.");
            }
        }

        input.close();
    }
}