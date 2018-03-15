import lt.kcs.utils.Skaiciavimai;

public class MyMainCalculator {

    public static void main(String[] args) {

        boolean val = Skaiciavimai.isNumberNegative(12);

        if (val) {
            System.out.println("Teigiamas");
        } else {
            System.out.println("Neigiamas");
        }
    }
}
