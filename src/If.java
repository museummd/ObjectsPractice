//Conditi rebue sa returneze "true"
public class If {
    public static void main(String[] args) {
        int myInt = 20;
        int reg = 19;
        if (5 > 6){
            System.out.println("Da este corect");
        } else if (myInt > reg) {
            myInt = reg;
            System.out.println("Nu este corect " + myInt);
        } else {
            System.out.println("Nu corespunde nici o valoare");
        }
    }
}
