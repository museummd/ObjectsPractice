import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Scrie un numar");
        String string = s.nextLine();
        //int x = s.nextInt();
        System.out.println("Ai scris numarul: " + s);
    }
}
