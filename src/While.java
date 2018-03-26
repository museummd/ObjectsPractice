import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ghiceste un numar de la 1 la 10");
        int value = scan.nextInt();
        while (value != 7){
            System.out.println("Nu ai chicit mai incearca o data");
            value = scan.nextInt();
        }
        System.out.println("Ai ghicit! Cifra cistigatoare era - " + value);

    }
}
