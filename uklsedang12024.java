import java.util.Scanner;
public class uklsedang12024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang ingin dihitung faktorial:");
        long bilangan = input.nextLong();

        long faktorial = 1;
        for (long i = 1; i <= bilangan; i++) {
            faktorial *= i; 
            if (i == bilangan){
                System.out.println(i);
            } else {
                System.out.print(i+"*");  
            }   
        }
        System.out.println("Hasil faktorial dari "+bilangan+" adalah "+faktorial);
    }
}
