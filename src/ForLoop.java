public class ForLoop {
    public static void main(String[] args) {
            int k = 0;
            for (int i = 10; i>=0; i = i-2){              //for (int i = 10; i>=0; i--) && for (int i = 0; i<=10; i++)
            System.out.println("Hello! " + (i + 1));
        }
        for (; k<=10; k++){                              //(k = 1; k<=10; k++)
            System.out.println("Buna " + k);
        }
    }
}
