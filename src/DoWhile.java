import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ghiceste un numar de la 1 la 10");
        int value;
        do {
            value = scan.nextInt();
            if (value != 7) {
                System.out.println("Nu ai ghicit mai incearca o data ");
            }

        } while (value != 7); {
            System.out.println("Ai ghicit! Cifra cistigatoare era - " + value);
            for (int i = 0;i <= 10; i = i+2){
                System.out.println("Ha!");

            }
        }

    }
}
